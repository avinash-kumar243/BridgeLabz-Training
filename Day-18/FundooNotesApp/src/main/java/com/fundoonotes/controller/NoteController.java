package com.fundoonotes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import com.fundoonotes.dto.request.ReminderRequestDto;
import com.fundoonotes.dto.request.TagRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.model.Note;
import com.fundoonotes.service.INoteService;
import com.fundoonotes.service.impl.NoteExportService;

import io.swagger.v3.oas.annotations.Operation;


@RestController 
@RequestMapping("/api/v1/notes")
public class NoteController {

    private final INoteService noteService;
    private final NoteExportService noteExportService;

    // Constructor Injection
    public NoteController(INoteService noteService, NoteExportService noteExportService) {
        this.noteService = noteService;
        this.noteExportService = noteExportService;
    }   
    
    
    // Create Note
    @Operation(summary = "Create a new note", description = "Creates a new note for the currently authenticated user using the provided note details")
    @PostMapping("") 
    public ResponseEntity<NoteResponseDto> createNote(@RequestBody NoteRequestDto requestDto) {
    		
    		NoteResponseDto result = noteService.createNote(requestDto, currentUserId());
    		
    		return ResponseEntity.status(HttpStatus.CREATED).body(result);  
    }
    
    
    // Delete a Note 
    @Operation(summary = "Delete a note", description = "Deletes a note belonging to the currently authenticated user using the note ID")
    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) { 
    	
    		boolean deleted = noteService.deleteNoteById(id, currentUserId());
    		
    		return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    } 
    
    
    // Get all Notes of an User
    @Operation(summary = "Get user notes", description = "Retrieves notes belonging to the currently authenticated user. Notes can optionally be filtered by state and pinned status")
    @GetMapping("")
    public ResponseEntity<List<NoteResponseDto>> getNotes(@RequestParam(required = false) Note.NoteState state, 
    														 @RequestParam(required = false) Boolean pinned) {
    		 
        List<NoteResponseDto> notes = noteService.getNotes(currentUserId(), state, pinned);

        return ResponseEntity.ok(notes);
    } 
    
    
    
    // Archive a Note
    @Operation(summary = "Archive a note", description = "Archives a note belonging to the currently authenticated user")
    @PatchMapping("/{noteId}/archive")
    public ResponseEntity<NoteResponseDto> archiveNote(@PathVariable Long noteId) {
    		
    		NoteResponseDto archivedNote = noteService.archiveNote(noteId, currentUserId()); 
    		 
    		return ResponseEntity.ok(archivedNote);  
    }
    
    
    // Trash a Note
    @Operation(summary = "Move a note to trash", description = "Moves a note belonging to the currently authenticated user to the trash")
    @PatchMapping("/{noteId}/trash")
    public ResponseEntity<NoteResponseDto> trashNote(@PathVariable Long noteId) {
    		
    		NoteResponseDto trashedNote = noteService.trashNote(noteId, currentUserId());
    		
    		return ResponseEntity.ok(trashedNote); 
    } 
    
    
    // Restore a Note
    @Operation(summary = "Restore a note", description = "Restores a trashed note belonging to the currently authenticated user to the active state")
    @PatchMapping("/{noteId}/restore")
    public ResponseEntity<NoteResponseDto> restoreNote(@PathVariable Long noteId) {
    	
    		NoteResponseDto restoredNote = noteService.restoreNote(noteId, currentUserId());
    	
    		return ResponseEntity.ok(restoredNote); 
    }
    
    
    // Pin a Note
    @Operation(summary = "Pin a note", description = "Pins a note belonging to the currently authenticated user")
    @PatchMapping("/{noteId}/pin")
    public ResponseEntity<NoteResponseDto> pinNote(@PathVariable Long noteId) {

        NoteResponseDto pinnedNote = noteService.pinNote(noteId, currentUserId());

        return ResponseEntity.ok(pinnedNote); 
    } 
    
    
    // Search Notes
    @Operation(summary = "Search notes", description = "Searches notes belonging to the currently authenticated user using optional title, state, and tag filters")
    @GetMapping("/search")
    public ResponseEntity<List<NoteResponseDto>> searchNotes(@RequestParam(required = false) String title,
												            @RequestParam(required = false) Note.NoteState state,
												            @RequestParam(required = false) String tag) {

        List<NoteResponseDto> notes = noteService.searchNotes(currentUserId(), title, state, tag);

        return ResponseEntity.ok(notes); 
    }
    
    
    // Add Tag to Note
    @Operation(summary = "Add a tag to a note", description = "Adds a tag to a note belonging to the currently authenticated user")
    @PostMapping("/{id}/tags")
    public ResponseEntity<NoteResponseDto> addTagToNote(@PathVariable Long id, @RequestBody TagRequestDto request) {

        NoteResponseDto response = noteService.addTagToNote(id, currentUserId(), request);

        return ResponseEntity.ok(response);  
    }
    
    
    // Send reminder to note using RabbitMQ
    @Operation(summary = "Set a reminder for a note", description = "Sets a reminder for a note and queues the reminder message using RabbitMQ")
    @PostMapping("/{noteId}/reminder")
    public ResponseEntity<String> setReminder(@PathVariable Long noteId, @RequestBody ReminderRequestDto request) {

        Long userId = currentUserId();

        noteService.setReminder(noteId, userId, request.getReminderAt());

        return ResponseEntity.ok("Reminder queued successfully"); 
    }
    
    
    // Export ACTIVE Notes to Excel
    @Operation(summary = "Export active notes to Excel", description = "Exports all active notes belonging to the currently authenticated user as an Excel file")
    @GetMapping("/export")
	public ResponseEntity<byte[]> exportNotes() throws Exception {

		List<Note> notes = noteService.findActiveByOwner(currentUserId());

		byte[] excelBytes = noteExportService.exportToExcel(notes);

		return ResponseEntity.ok()
				.header("Content-Disposition", "attachment; filename=my-notes.xlsx")
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.body(excelBytes); 
	}
	
    
    
    // Helper method to provide authenticated user id 
    private Long currentUserId() {

        String userId = (String) SecurityContextHolder.getContext()
									                 .getAuthentication()
									                 .getPrincipal();
        return Long.parseLong(userId);   
    }
}