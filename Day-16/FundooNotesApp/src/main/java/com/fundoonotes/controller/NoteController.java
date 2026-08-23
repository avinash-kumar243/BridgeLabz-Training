package com.fundoonotes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.request.TagRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.model.Note;
import com.fundoonotes.service.INoteService;


@RestController 
@RequestMapping("/api/v1/notes")
public class NoteController {

    private final INoteService noteService;

    // Constructor Injection
    public NoteController(INoteService noteService) {
        this.noteService = noteService;
    }  
    
    
    // Create Note
    @PostMapping("") 
    public ResponseEntity<NoteResponseDto> createNote(@RequestBody NoteRequestDto requestDto) {
    		
    		NoteResponseDto result = noteService.createNote(requestDto, currentUserId());
    		
    		return ResponseEntity.status(HttpStatus.CREATED).body(result);  
    }
    
    
    // Delete a Note 
    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) { 
    	
    		boolean deleted = noteService.deleteNoteById(id, currentUserId());
    		
    		return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    } 
    
    
    // Get all Notes of an User
    @GetMapping("")
    public ResponseEntity<List<NoteResponseDto>> getNotes(@RequestParam(required = false) Note.NoteState state, 
    														 @RequestParam(required = false) Boolean pinned) {
    		 
        List<NoteResponseDto> notes = noteService.getNotes(currentUserId(), state, pinned);

        return ResponseEntity.ok(notes);
    } 
    
    
    
    // Archive a Note
    @PatchMapping("/{noteId}/archive")
    public ResponseEntity<NoteResponseDto> archiveNote(@PathVariable Long noteId) {
    		
    		NoteResponseDto archivedNote = noteService.archiveNote(noteId, currentUserId()); 
    		 
    		return ResponseEntity.ok(archivedNote);  
    }
    
    
    // Trash a Note
    @PatchMapping("/{noteId}/trash")
    public ResponseEntity<NoteResponseDto> trashNote(@PathVariable Long noteId) {
    		
    		NoteResponseDto trashedNote = noteService.trashNote(noteId, currentUserId());
    		
    		return ResponseEntity.ok(trashedNote); 
    } 
    
    
    // Restore a Note
    @PatchMapping("/{noteId}/restore")
    public ResponseEntity<NoteResponseDto> restoreNote(@PathVariable Long noteId) {
    	
    		NoteResponseDto restoredNote = noteService.restoreNote(noteId, currentUserId());
    	
    		return ResponseEntity.ok(restoredNote); 
    }
    
    
    // Pin a Note
    @PatchMapping("/{noteId}/pin")
    public ResponseEntity<NoteResponseDto> pinNote(@PathVariable Long noteId) {

        NoteResponseDto pinnedNote = noteService.pinNote(noteId, currentUserId());

        return ResponseEntity.ok(pinnedNote); 
    } 
    
    
    @GetMapping("/search")
    public ResponseEntity<List<NoteResponseDto>> searchNotes(@RequestParam(required = false) String title,
												            @RequestParam(required = false) Note.NoteState state,
												            @RequestParam(required = false) String tag) {

        List<NoteResponseDto> notes = noteService.searchNotes(currentUserId(), title, state, tag);

        return ResponseEntity.ok(notes); 
    }
    
    
    @PostMapping("/{id}/tags")
    public ResponseEntity<NoteResponseDto> addTagToNote(@PathVariable Long id, @RequestBody TagRequestDto request) {

        NoteResponseDto response = noteService.addTagToNote(id, currentUserId(), request);

        return ResponseEntity.ok(response);  
    }
    
    
    // Helper method to provide authenticated user id
    private Long currentUserId() {

        String userId = (String) SecurityContextHolder.getContext()
									                 .getAuthentication()
									                 .getPrincipal();
        return Long.parseLong(userId);   
    }
}