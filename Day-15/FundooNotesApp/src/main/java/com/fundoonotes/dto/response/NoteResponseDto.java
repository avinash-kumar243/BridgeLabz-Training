package com.fundoonotes.dto.response;

import java.util.Set;

import com.fundoonotes.model.Note.NoteState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NoteResponseDto {
	
	private Long id;

	private String title;
	
	private String content;
	
	private NoteState state;
	
	private boolean pinned;
	
	private Set<String> tags;
} 