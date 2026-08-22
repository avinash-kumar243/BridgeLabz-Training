package com.fundoonotes.service;

import java.util.List;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.request.TagRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.model.Note;

public interface INoteService {
	
	NoteResponseDto createNote(NoteRequestDto request, Long userId);
	
	boolean deleteNoteById(Long id, Long userId); 
	 	
	NoteResponseDto archiveNote(Long noteId, Long userId); 
	
	NoteResponseDto trashNote(Long noteId, Long userId);
	
	NoteResponseDto restoreNote(Long noteId, Long userId);
	
	NoteResponseDto pinNote(Long noteId, Long userId); 
	
	List<NoteResponseDto> getNotes(Long userId, Note.NoteState state, Boolean pinned);
	
	List<NoteResponseDto> searchNotes(Long userId, String title, Note.NoteState state, String tag);
	
	NoteResponseDto addTagToNote(Long noteId, Long userId, TagRequestDto request);
	
	NoteResponseDto addTagToNote(Long noteId, Long userId, String tagName);
	 
	public List<NoteResponseDto> findByOwnerAndTag(Long userId, String tagName);  
}  