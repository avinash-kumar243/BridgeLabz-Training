package com.practice.greetings.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.practice.greetings.dto.LoginRequestDto;
import com.practice.greetings.dto.PasswordUpdateRequestDto;
import com.practice.greetings.dto.RegisterRequestDto;
import com.practice.greetings.entity.User;
import com.practice.greetings.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    

    // Registration
    public boolean register(RegisterRequestDto request) {

        // Check whether email already exists
        if(userRepository.existsByEmail(request.getEmail())) {
            return false;
        }

        // Create database entity
        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());

        // Hash password before storing
        String hashedPassword = passwordEncoder.encode(request.getPassword());
        user.setPassword(hashedPassword);

        // Save user to db
        userRepository.save(user);
        return true;
    }

    
    // Login
    public Optional<User> login(LoginRequestDto request) {
    	
    		// Check if user account found or not with this email
        Optional<User> userOptional = userRepository.findByEmail(request.getEmail());

        if(userOptional.isEmpty()) {
            return Optional.empty();
        }

        User user = userOptional.get(); 

        // Compare entered password with stored hash
        boolean passwordMatches = passwordEncoder.matches(request.getPassword(), user.getPassword());

        // If password matched then return user
        if(passwordMatches) {
            return Optional.of(user);
        }

        // If password does not match, then means incorrect password. So, return empty object
        return Optional.empty();
    }
    
    
    // Get user by ID
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() ->
        new RuntimeException("User not found"));
    }

    
    // Update name
    public void updateName(Long userId, String newName) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setName(newName);

        userRepository.save(user);
    }
}