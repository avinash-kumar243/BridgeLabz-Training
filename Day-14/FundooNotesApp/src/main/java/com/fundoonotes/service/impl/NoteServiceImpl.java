package com.fundoonotes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.mapper.NoteMapper;
import com.fundoonotes.model.Note;
import com.fundoonotes.model.User;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.INoteService;

@Service
public class NoteServiceImpl implements INoteService {
	
	private final NoteRepository noteRepository;
	private final UserRepository userRepository;
	private final NoteMapper noteMapper;
	
	
	// Constructor Injection
	public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, NoteMapper noteMapper) {
		this.noteRepository = noteRepository;
		this.userRepository = userRepository;
		this.noteMapper = noteMapper;
	}
	

	@Override
	public NoteResponseDto createNote(NoteRequestDto request, long userId) {
		
		User owner = userRepository.findById(userId)
								   .orElseThrow(() -> new IllegalArgumentException("User not found"));
		
		Note note = new Note();
		
		note.setTitle(request.getTitle());
        note.setContent(request.getContent());
        note.setOwner(owner); 

        Note savedNote = noteRepository.save(note);

        return noteMapper.toResponseDTO(savedNote); 
	}
	
	
	@Override
	public boolean deleteNoteById(int id, long userId) {
		User owner = userRepository.findById(userId)
				   				   .orElseThrow(() -> new IllegalArgumentException("User not found"));

		return noteRepository.findByNoteIdAndOwner(id, owner)
							 .map(note -> {
							  	 noteRepository.delete(note);
								 return true;
							 })  
							 .orElse(false); 
	} 

	
	@Override
	public List<NoteResponseDto> getAllNotesForOneOwner(int id) {
		User owner = userRepository.findById((long)id)
                					   .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return noteRepository.findByOwner(owner)
                .stream() 
                .map(noteMapper::toResponseDTO)
                .toList(); 
	}

}