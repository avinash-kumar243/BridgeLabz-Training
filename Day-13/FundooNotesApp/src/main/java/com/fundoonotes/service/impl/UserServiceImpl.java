package com.fundoonotes.service.impl;

import com.fundoonotes.dto.LoginRequestDto;
import com.fundoonotes.dto.RegisterRequestDto;
import com.fundoonotes.model.User;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;
import com.fundoonotes.service.IUserService;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service; 

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    
    // Register User
    @Override
    public String register(RegisterRequestDto request) {
    	
    		// Duplicate Email
        if(userRepository.findByEmail(request.getEmail()).isPresent()) { 
            throw new IllegalArgumentException("Email already registered");
        }

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPasswordHash(passwordEncoder.encode(request.getPassword()));

        // Save user details
        User savedUser = userRepository.save(user);

        	// return JWT Token
        return jwtUtil.generateToken(
                String.valueOf(savedUser.getUserId()),
                savedUser.getEmail()
        ); 
    }

    
    // Login User
    @Override
    public String login(LoginRequestDto request) {

        User user = userRepository.findByEmail(request.getEmail())
        				 		.orElseThrow(() -> new IllegalArgumentException("User not found with this email: " + request.getEmail()));

         
        // Match Password
        if(!passwordEncoder.matches(request.getPassword(), user.getPasswordHash())) {
            throw new IllegalArgumentException("Invalid password");
        }

        // return JWT Token
        return jwtUtil.generateToken(
                String.valueOf(user.getUserId()), 
                user.getEmail()
        );  
    }
}