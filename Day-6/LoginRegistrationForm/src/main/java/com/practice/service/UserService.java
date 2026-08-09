package com.practice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.User;
import com.practice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// Registration
	public boolean registerUser(User user) {
		
		// Check if user is already registered
	    if(userRepository.findByEmail(user.getEmail()).isPresent()) {
	        return false;
	    }

	    userRepository.save(user);
	    return true; 
	}
	 
	// Login
	public User loginUser(String email, String password){
		Optional<User> optionalUser = userRepository.findByEmail(email);
		
		if(optionalUser.isPresent()) {
			User user = optionalUser.get();
		
			if(user.getPassword().equals(password)) {
			  return user; 
			}
		}
		return null;
	}
}