package com.fundoonotes.service.impl;

import com.fundoonotes.dto.request.ForgotPasswordRequestDto;
import com.fundoonotes.dto.request.LoginRequestDto;
import com.fundoonotes.dto.request.RegisterRequestDto;
import com.fundoonotes.dto.request.ResetPasswordRequestDto;
import com.fundoonotes.exception.DuplicateEmailException;
import com.fundoonotes.exception.UserNotFoundException;
import com.fundoonotes.model.PasswordResetToken;
import com.fundoonotes.model.User;
import com.fundoonotes.repository.PasswordResetTokenRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;
import com.fundoonotes.service.IUserService;

import jakarta.transaction.Transactional;

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
    private final PasswordResetTokenRepository passwordResetTokenRepository;

    // Constructor Injection
    public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder, TokenBlacklistService tokenBlacklistService, PasswordResetTokenRepository passwordResetTokenRepository) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.tokenBlacklistService = tokenBlacklistService; 
        this.passwordResetTokenRepository = passwordResetTokenRepository;
    }

    
    // Register User
    @Override
    public String register(RegisterRequestDto request) {
    	
    		// Duplicate Email
        if(userRepository.findByEmail(request.getEmail()).isPresent()) { 
            throw new DuplicateEmailException("Email already registered"); 
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
        				 		.orElseThrow(() -> new UserNotFoundException("User not found with this email: " + request.getEmail()));

         
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
    @Transactional
    public String forgotPassword(ForgotPasswordRequestDto request) { 

        User user = userRepository.findByEmail(request.getEmail())
                				.orElseThrow(() -> new UserNotFoundException("User not found with this email"));

        // Delete old reset token
        passwordResetTokenRepository.deleteByUser(user);
        
        // Immediately execute DELETE in database
        passwordResetTokenRepository.flush();
        
        String resetToken = UUID.randomUUID().toString();

        PasswordResetToken passwordResetToken = new PasswordResetToken();

        passwordResetToken.setResetToken(resetToken);
        passwordResetToken.setExpiryTime(LocalDateTime.now().plusMinutes(10));
        passwordResetToken.setUser(user);
 
        passwordResetTokenRepository.save(passwordResetToken); 

        return resetToken;
    }
    
    
    // Reset Password
    @Override
    @Transactional
    public void resetPassword(ResetPasswordRequestDto request) {

    		PasswordResetToken passwordResetToken = passwordResetTokenRepository.findByResetToken(request.getResetToken())
                        									.orElseThrow(() -> new IllegalArgumentException("Invalid reset token"));

        // Check token expired or not
        if(passwordResetToken.getExpiryTime().isBefore(LocalDateTime.now())) {
        	
            passwordResetTokenRepository.delete(passwordResetToken);
        
            throw new IllegalArgumentException("Reset token has expired");
        }

        User user = passwordResetToken.getUser();

        // Update password
        user.setPasswordHash(passwordEncoder.encode(request.getNewPassword()));
        
        userRepository.save(user);

        passwordResetTokenRepository.delete(passwordResetToken); 
    }
}