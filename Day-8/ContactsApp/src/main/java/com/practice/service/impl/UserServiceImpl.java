package com.practice.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.practice.dto.ContactRequestDto;
import com.practice.dto.ContactResponseDto;
import com.practice.exception.ContactNotFoundException;
import com.practice.exception.DuplicateEmailFoundException;
import com.practice.model.Contact;
import com.practice.repository.UserRepository;
import com.practice.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	private final UserRepository userRepository;
	private final ModelMapper modelMapper;

	public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
		this.userRepository = userRepository;
		this.modelMapper = modelMapper; 
	}
	
	
	@Override
	public ContactResponseDto createContact(ContactRequestDto contactDto) {
		Contact currentContact = userRepository.findByEmail(contactDto.getEmail());
		
		// Duplicate Email
		if(currentContact != null) {
			throw new DuplicateEmailFoundException("Duplicate Email Found!!!"); 
		} 
		
		Contact contact = new Contact();
		
		contact.setEmail(contactDto.getEmail());
		contact.setFirstName(contactDto.getFirstName());
		contact.setLastName(contactDto.getLastName());
		contact.setPhone(contactDto.getPhone());
		
		Contact savedContact = userRepository.save(contact);
		
		ContactResponseDto response = modelMapper.map(savedContact, ContactResponseDto.class);
		
		return response; 
	}
	

	@Override
	public ContactResponseDto updateContact(Long id, ContactRequestDto contactRequestDto) {
		Contact currentContact = userRepository.findById(id).orElseThrow(() -> new ContactNotFoundException("Account not found!!!"));

		currentContact.setEmail(contactRequestDto.getEmail());
		currentContact.setFirstName(contactRequestDto.getFirstName());
		currentContact.setLastName(contactRequestDto.getLastName());
		currentContact.setPhone(contactRequestDto.getPhone()); 
		
		userRepository.save(currentContact); 
		
		ContactResponseDto response = modelMapper.map(currentContact, ContactResponseDto.class);
		
		return response; 
	}
	

	@Override
	public ContactResponseDto deleteContact(Long id) {
		Contact currentContact = userRepository.findById(id).orElseThrow(() -> new ContactNotFoundException("Contact not found!!!"));

		userRepository.deleteById(currentContact.getId());
		
		ContactResponseDto response = modelMapper.map(currentContact, ContactResponseDto.class);
		
		return response; 
	}

	
	@Override
	public ContactResponseDto getContactById(Long id) {
		Contact currentContact = userRepository.findById(id).orElseThrow(() -> new ContactNotFoundException("Contact not found!!!"));
		
		ContactResponseDto response = modelMapper.map(currentContact, ContactResponseDto.class);
		
		return response; 
	}

	@Override
	public List<ContactResponseDto> getAllContacts() {
		List<Contact> contactList = userRepository.findAll(); 
		
		List<ContactResponseDto> responseList = contactList.stream().map(contact -> modelMapper.map(contact, ContactResponseDto.class)).toList();
		
		return responseList;  
	}
		
}