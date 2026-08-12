package com.practice.service;

import java.util.List;

import com.practice.dto.ContactRequestDto;
import com.practice.dto.ContactResponseDto;

public interface IUserService {
	
	ContactResponseDto createContact(ContactRequestDto contact);
	ContactResponseDto updateContact(Long id, ContactRequestDto contact);
	ContactResponseDto deleteContact(Long id);
	ContactResponseDto getContactById(Long id);
	List<ContactResponseDto> getAllContacts();
} 