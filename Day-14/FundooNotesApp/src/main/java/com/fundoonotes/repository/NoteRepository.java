package com.fundoonotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundoonotes.model.Note;
import com.fundoonotes.model.User;

public interface NoteRepository extends JpaRepository<Note, Long> {
	
	List<Note> findByOwner(User owner);
	
	Optional<Note> findByNoteIdAndOwner(int noteId, User owner);
}