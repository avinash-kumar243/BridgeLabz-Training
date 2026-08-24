package com.fundoonotes.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notes")
@Setter 
@Getter
@NoArgsConstructor
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noteId;
	
	@Column(nullable = false)
	private String title;
	
	@Column(length = 2000)
	private String content;
	 
	private LocalDateTime createdAt = LocalDateTime.now(); 
	
	@ManyToOne
	@JoinColumn(name = "user_id") 
	private User owner; 
	
	
	public enum NoteState {
		ACTIVE,
		ARCHIVED,
		TRASHED 
	}
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private NoteState state = NoteState.ACTIVE;
	
	private boolean pinned = false;
	 
	@ManyToMany
    @JoinTable(
        name = "note_tags",
        joinColumns = @JoinColumn(name = "note_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags = new HashSet<>();
	
	
	@Column(name = "reminder_at")
	private LocalDateTime reminderAt;
}
