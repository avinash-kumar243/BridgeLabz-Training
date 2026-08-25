package com.fundoonotes.controller;

import com.fundoonotes.dto.request.ForgotPasswordRequestDto;
import com.fundoonotes.dto.request.LoginRequestDto;
import com.fundoonotes.dto.request.RegisterRequestDto;
import com.fundoonotes.dto.request.ResetPasswordRequestDto;
import com.fundoonotes.dto.response.AuthResponseDto;
import com.fundoonotes.messaging.jms.JmsReminderProducer;
import com.fundoonotes.service.impl.UserServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    private final UserServiceImpl userService;
    private final JmsReminderProducer reminderProducer;

    // Constructor Injection
    public UserController(UserServiceImpl userService, JmsReminderProducer reminderProducer) {
        this.userService = userService;
        this.reminderProducer = reminderProducer; 
    }
    

    
    // Register User
    @Operation(summary = "Register a new user", description = "Creates a new user account using the provided registration details and returns a JWT token")
    @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@Valid @RequestBody RegisterRequestDto request) { 
        
    		String token = userService.register(request);
    		
        return ResponseEntity.status(HttpStatus.CREATED).body(new AuthResponseDto(token, "Registration Successful"));  
    }
    

    // Login User
    @Operation(summary = "Login user", description = "Authenticates a user using email and password and returns a JWT token")
    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@Valid @RequestBody LoginRequestDto request) {
        
    		String token = userService.login(request); 
    		
        return ResponseEntity.ok(new AuthResponseDto(token, "Login Successful")); 
    } 
    
    
    // Logout User
    @Operation(summary = "Logout user", description = "Logs out the authenticated user by invalidating the provided JWT token")
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader("Authorization") String authorizationHeader) {

        if(authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            return ResponseEntity.badRequest().body("Invalid Authorization header");
        }

        // Extract token from authorization header
        String token = authorizationHeader.substring(7);

        userService.logout(token);

        return ResponseEntity.ok("Logout Successful"); 
    }
    
    
    // Forgot Password
    @Operation(summary = "Request password reset", description = "Generates a password reset token for the provided email and sends the reset request through JMS")
    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@Valid @RequestBody ForgotPasswordRequestDto request) {

        String resetToken = userService.forgotPassword(request);
        
        reminderProducer.sendPasswordResetRequest(request.getEmail(), resetToken);  

        return ResponseEntity.ok().build(); 
    }
    
     
    // Reset Password 
    @Operation(summary = "Reset user password", description = "Resets the user's password using the provided password reset details")
    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@Valid @RequestBody ResetPasswordRequestDto request) {

        userService.resetPassword(request);

        return ResponseEntity.ok("Password reset successful"); 
    }
}