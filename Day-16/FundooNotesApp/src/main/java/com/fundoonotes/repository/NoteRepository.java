package com.fundoonotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fundoonotes.model.Note;
import com.fundoonotes.model.User;

public interface NoteRepository extends JpaRepository<Note, Long>, JpaSpecificationExecutor<Note> {
	
	List<Note> findByOwner(User owner);
	
	List<Note> findByOwnerAndState(User owner, Note.NoteState state); 
	
	List<Note> findByOwnerAndPinned(User owner, boolean pinned);
	
	List<Note> findByOwnerAndStateAndPinned(User owner, Note.NoteState state, boolean pinned);
	
	Optional<Note> findByNoteIdAndOwner(Long noteId, User owner);

	List<Note> findByOwnerAndTagsName(User owner, String tagName);   
} 