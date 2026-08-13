package com.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactResponseDto {
	
	private Long id;
	private String firstName;	
	private String lastName;
	private String email;
	private String phone;
}