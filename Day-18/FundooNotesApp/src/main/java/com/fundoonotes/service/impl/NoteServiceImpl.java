package com.fundoonotes.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.request.TagRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.exception.NoteNotFoundException;
import com.fundoonotes.exception.UserNotFoundException;
import com.fundoonotes.mapper.NoteMapper;
import com.fundoonotes.messaging.rabbitmq.RabbitReminderProducer;
import com.fundoonotes.messaging.rabbitmq.ReminderMessageBody;
import com.fundoonotes.model.Note;
import com.fundoonotes.model.User;
import com.fundoonotes.model.Note.NoteState;
import com.fundoonotes.model.Tag;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.TagRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.INoteService;
import com.fundoonotes.specification.NoteSpecifications;

@Service
public class NoteServiceImpl implements INoteService {
	
	private final NoteRepository noteRepository;
	private final UserRepository userRepository;
	private final NoteMapper noteMapper;
	private final TagRepository tagRepository;
	private final RabbitReminderProducer rabbitReminderProducer;
	
	
	// Constructor Injection
	public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, NoteMapper noteMapper, TagRepository tagRepository, RabbitReminderProducer rabbitReminderProducer) {
		this.noteRepository = noteRepository;
		this.userRepository = userRepository;
		this.noteMapper = noteMapper;
		this.tagRepository = tagRepository; 
		this.rabbitReminderProducer = rabbitReminderProducer;  
	}
	

	@Override
	public NoteResponseDto createNote(NoteRequestDto request, Long userId) {
		
		User owner = userRepository.findById(userId)
								   .orElseThrow(() -> new UserNotFoundException("User not found"));
		
		Note note = new Note();
		
		note.setTitle(request.getTitle());
        note.setContent(request.getContent());
        note.setOwner(owner); 

        Note savedNote = noteRepository.save(note);

        return noteMapper.toResponseDTO(savedNote); 
	}	
	
	
	@Override
	public boolean deleteNoteById(Long id, Long userId) {
		User owner = userRepository.findById(userId)
				   				   .orElseThrow(() -> new UserNotFoundException("User not found"));

		return noteRepository.findByNoteIdAndOwner(id, owner)
							 .map(note -> { 
							  	 noteRepository.delete(note);
								 return true;
							 })  
							 .orElse(false); 
	} 



	@Override
	public NoteResponseDto archiveNote(Long noteId, Long userId) {
		
		Note note = getUserNote(noteId, userId);
		
		note.setState(Note.NoteState.ARCHIVED);
		note.setPinned(false);
		
		Note archivedNote = noteRepository.save(note);
		
		return noteMapper.toResponseDTO(archivedNote); 
	} 


	@Override
	public NoteResponseDto trashNote(Long noteId, Long userId) {
		
		Note note = getUserNote(noteId, userId);
		
		note.setState(Note.NoteState.TRASHED);
		note.setPinned(false);
		
		Note trashedNote = noteRepository.save(note);
		
		return noteMapper.toResponseDTO(trashedNote); 
	}


	@Override
	public NoteResponseDto restoreNote(Long noteId, Long userId) {
		
		Note note = getUserNote(noteId, userId);
		
		note.setState(Note.NoteState.ACTIVE);
		
		Note restoredNote = noteRepository.save(note); 

	    return noteMapper.toResponseDTO(restoredNote);
	}


	@Override
	public NoteResponseDto pinNote(Long noteId, Long userId) {

	    Note note = getUserNote(noteId, userId); 

	    if(note.getState() == Note.NoteState.TRASHED) { 
	        throw new IllegalStateException("Cannot pin a note that is in Trash");
	    } 

	    note.setPinned(true);

	    Note pinnedNote = noteRepository.save(note);

	    return noteMapper.toResponseDTO(pinnedNote);
	}
	
	
	@Override
	public List<NoteResponseDto> getNotes(Long userId, NoteState state, Boolean pinned) {
		
		User owner = userRepository.findById(userId)
						.orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));

		List<Note> notes; 

		if(state != null && pinned != null) {
		        notes = noteRepository.findByOwnerAndStateAndPinned(owner, state, pinned);
	    } else if(state != null) {
	        notes = noteRepository.findByOwnerAndState(owner, state);
	    } else if(pinned != null) {
	        notes = noteRepository.findByOwnerAndPinned(owner, pinned);
	    } else {
	        notes = noteRepository.findByOwner(owner); 
	    }

	    return notes.stream() 
	    				.map(noteMapper::toResponseDTO)
	    				.toList(); 
	}

	
	@Override
	public List<NoteResponseDto> searchNotes(Long userId, String title, NoteState state, String tag) {
		
		User owner = userRepository.findById(userId)
	            .orElseThrow(() ->
	                    new UserNotFoundException("User not found"));

	    Specification<Note> specification = NoteSpecifications.search(owner, title, state, tag);

	    return noteRepository.findAll(specification)
				             .stream()
				             .map(noteMapper::toResponseDTO) 
				             .toList(); 
	}

	
	@Override
	public NoteResponseDto addTagToNote(Long noteId, Long userId, TagRequestDto request) {

	    User owner = userRepository.findById(userId)
	    			.orElseThrow(() -> new UserNotFoundException("User not found"));

	    Note note = noteRepository.findByNoteIdAndOwner(noteId, owner)
	            .orElseThrow(() -> new NoteNotFoundException("Note not found"));

	    String tagName = request.getName().trim();

	    Tag tag = tagRepository.findByName(tagName)
 				               .orElseGet(() -> tagRepository.save(new Tag(tagName)));

	    note.getTags().add(tag);

	    Note savedNote = noteRepository.save(note); 

	    return noteMapper.toResponseDTO(savedNote);
	}
	
		
	@Override
	public NoteResponseDto addTagToNote(Long noteId, Long userId, String tagName) {
		
		Note note = getUserNote(noteId, userId); 
		
		Tag tag = tagRepository.findByName(tagName)
				.orElseGet(() -> tagRepository.save(new Tag(tagName)));
		 
		note.getTags().add(tag);  
		
		Note resultNote = noteRepository.save(note); 
		
		return noteMapper.toResponseDTO(resultNote); 
	}
	
	
	@Override
	public List<NoteResponseDto> findByOwnerAndTag(Long userId, String tagName) {
		
		User user = userRepository.findById(userId)
				.orElseThrow(	() -> new UserNotFoundException("User not found")); 
		
		List<Note> noteList = noteRepository.findByOwnerAndTagsName(user, tagName);  
		
		return noteList.stream()
					   .map(noteMapper::toResponseDTO)
					   .collect(Collectors.toList());  
	}
	
	
	
	// Used to send reminder using RabbitMq
	public void setReminder(Long noteId, Long userId, LocalDateTime reminderAt) {

	    Note note = getUserNote(noteId, userId);

	    note.setReminderAt(reminderAt);
 
	    noteRepository.save(note);

	    ReminderMessageBody message = new ReminderMessageBody(
                note.getNoteId(),
                userId,
                note.getTitle(),
                reminderAt
        );

	    rabbitReminderProducer.sendReminder(message);  
	}
	

	@Override
	public List<Note> findActiveByOwner(Long userId) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));

		return noteRepository.findByOwnerAndState(owner, Note.NoteState.ACTIVE);
	}  
	 
	
	// private Helper method
	private Note getUserNote(Long noteId, Long userId) {
		
		User owner = userRepository.findById(userId)
						.orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));
		
		Note note = noteRepository.findByNoteIdAndOwner(noteId, owner)
						.orElseThrow(() -> new NoteNotFoundException("Note not found with this userId: " + userId));
		
		return note; 
	}
}