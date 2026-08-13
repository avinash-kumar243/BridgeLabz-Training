package com.practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.dto.ContactRequestDto;
import com.practice.dto.ContactResponseDto;
import com.practice.service.IUserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	private final IUserService iUsrService;

	public UserController(IUserService iUsrService) {
		this.iUsrService = iUsrService;
	}
	
	
	// Create a contact
	@PostMapping("/contact")
	public ContactResponseDto createContact(@Valid @RequestBody ContactRequestDto contact) {
		ContactResponseDto response = iUsrService.createContact(contact);
		return response; 
	}
	
	
	// Update a contact
	@PutMapping("/contact/{id}")
	public ContactResponseDto updateContact(@PathVariable Long id, @Valid @RequestBody ContactRequestDto contact) {
		ContactResponseDto response = iUsrService.updateContact(id, contact);
		return response; 
	}
	
	
	// Delete a contact
	@DeleteMapping("/contact/{id}")
	public ContactResponseDto deleteContact(@PathVariable Long id) {
		ContactResponseDto response = iUsrService.deleteContact(id);
		return response; 
	}
	 
	 
	// Get a contact by Id 
	@GetMapping("/contact/{id}")
	public ContactResponseDto getContactById(@PathVariable Long id) {
		ContactResponseDto response = iUsrService.getContactById(id);
		return response;
	}
	
	// Get all contacts
	@GetMapping("/contact")
	public List<ContactResponseDto> getAllContacts() {
		List<ContactResponseDto> contactList = iUsrService.getAllContacts();
		return contactList; 
	}
	
}