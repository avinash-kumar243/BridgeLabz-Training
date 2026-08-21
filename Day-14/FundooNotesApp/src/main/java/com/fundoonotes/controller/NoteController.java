package com.fundoonotes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.dto.request.NoteRequestDto;
import com.fundoonotes.dto.response.NoteResponseDto;
import com.fundoonotes.security.CustomUserDetails;
import com.fundoonotes.service.impl.NoteServiceImpl;


@RestController 
@RequestMapping("/api/v1")
public class NoteController {

    private final NoteServiceImpl noteService;

    // Constructor Injection
    public NoteController(NoteServiceImpl noteService) {
        this.noteService = noteService;
    } 
    
    
    // Create Note
    @PostMapping("/notes")
    public ResponseEntity<NoteResponseDto> createNote(@RequestBody NoteRequestDto requestDto) {
    		
    		NoteResponseDto result = noteService.createNote(requestDto, currentUserId());
    		
    		return ResponseEntity.status(HttpStatus.CREATED).body(result);  
    }
    
    
    // Delete a Note
    @DeleteMapping("/notes/{id}") 
    public ResponseEntity<Void> deleteNote(@PathVariable int id) { 
    	
    		boolean deleted = noteService.deleteNoteById(id, currentUserId());
    		
    		return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
    
    
    // Get all Notes of an User
    @GetMapping("/notes/{id}")
    public ResponseEntity<List<NoteResponseDto>> getAllNotesForAUser(@PathVariable int id) {
    		
    		List<NoteResponseDto> notes = noteService.getAllNotesForOneOwner(id);
    		
    		return ResponseEntity.ok(notes); 
    }
    
    
    // Helper method to provide user id
    private int currentUserId() {

        String userId = (String) SecurityContextHolder.getContext()
									                 .getAuthentication()
									                 .getPrincipal();

        return Integer.parseInt(userId); 
    }
}