package com.fundoonotes.mapper;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.model.Note;

@Component
public class NoteMapper {
	
	// Convert to Note Response dto
	public NoteResponseDto toResponseDTO(Note note) {
		
		NoteResponseDto noteResponseDto = new NoteResponseDto(note.getTitle(), note.getContent());

        return noteResponseDto; 
    }

}