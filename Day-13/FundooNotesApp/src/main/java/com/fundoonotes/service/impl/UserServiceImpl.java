package com.fundoonotes.service.impl;

import com.fundoonotes.dto.ForgotPasswordRequestDto;
import com.fundoonotes.dto.LoginRequestDto;
import com.fundoonotes.dto.RegisterRequestDto;
import com.fundoonotes.dto.ResetPasswordRequestDto;
import com.fundoonotes.model.User;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;
import com.fundoonotes.service.IUserService;
import com.fundoonotes.service.TokenBlacklistService;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service; 

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final TokenBlacklistService tokenBlacklistService;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder, TokenBlacklistService tokenBlacklistService) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.tokenBlacklistService = tokenBlacklistService; 
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
    
    
    // Logout User
    @Override
    public void logout(String token) {

        long expirationTime = jwtUtil.extractExpiration(token);

        tokenBlacklistService.blacklistToken(token, expirationTime); 
    }
    
    
    // Forget Password
    @Override
    public String forgotPassword(ForgotPasswordRequestDto request) { 

        User user = userRepository.findByEmail(request.getEmail())
                				.orElseThrow(() -> new IllegalArgumentException("User not found with this email"));

        String resetToken = UUID.randomUUID().toString();

        user.setResetToken(resetToken);

        user.setResetTokenExpiry(LocalDateTime.now().plusMinutes(10)); 

        userRepository.save(user);

        // For testing only - later this token will be sent through email.
        return resetToken;
    }
    
    
    // Reset Password
    @Override
    public void resetPassword(ResetPasswordRequestDto request) {

        User user = userRepository.findByResetToken(request.getResetToken())
                				.orElseThrow(() -> new IllegalArgumentException("Invalid reset token"));

        // Check token
        if(!request.getResetToken().equals(user.getResetToken())) {
            throw new IllegalArgumentException("Invalid reset token");
        }

        // Check token expired or not
        if(user.getResetTokenExpiry() == null || user.getResetTokenExpiry().isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Reset token has expired");
        } 

        // Encode new password
        user.setPasswordHash(passwordEncoder.encode(request.getNewPassword()));

        // Invalidate reset token after successful reset
        user.setResetToken(null);
        user.setResetTokenExpiry(null);

        userRepository.save(user);
    }
}