package com.fundoonotes.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.model.Note;
import com.fundoonotes.model.Tag;

@Component
public class NoteMapper {
	
	// Convert to Note Response dto
	public NoteResponseDto toResponseDTO(Note note) {
		
	    Set<String> tags = note.getTags().stream()
							            .map(Tag::getName)
							            .collect(Collectors.toSet()); 
		
		NoteResponseDto noteResponseDto = new NoteResponseDto(note.getNoteId(),
															 note.getTitle(), 
															 note.getContent(), 
															 note.getState(), 
															 note.isPinned(),
															 tags); 

        return noteResponseDto; 
    }

}