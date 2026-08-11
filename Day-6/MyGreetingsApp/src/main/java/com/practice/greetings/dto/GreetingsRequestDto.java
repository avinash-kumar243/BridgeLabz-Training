package com.practice.greetings.dto;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GreetingsRequestDto {

	@NotBlank(message = "Greetings cannot be empty")
    private String message;
} 