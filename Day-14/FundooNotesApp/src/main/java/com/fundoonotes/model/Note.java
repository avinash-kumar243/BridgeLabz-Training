package com.fundoonotes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
}
