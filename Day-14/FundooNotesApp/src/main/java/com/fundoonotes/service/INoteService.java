package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;

public interface INoteService {
	
	NoteResponseDto createNote(NoteRequestDto request, long userId);
	
	boolean deleteNoteById(int id, long userId); 
	 
	List<NoteResponseDto> getAllNotesForOneOwner(int id);
}  