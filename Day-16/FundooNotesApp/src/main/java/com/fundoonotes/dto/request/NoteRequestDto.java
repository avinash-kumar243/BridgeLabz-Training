package com.fundoonotes.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NoteRequestDto {
	
	@NotBlank(message = "Title is required")
	private String title;
	
	@Size(max = 2000, message = "Content length must be below 2000 characters")
	private String content;
}