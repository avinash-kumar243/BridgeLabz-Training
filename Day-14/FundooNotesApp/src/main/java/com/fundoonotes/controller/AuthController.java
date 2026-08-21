package com.fundoonotes.controller;

import com.fundoonotes.dto.request.ForgotPasswordRequestDto;
import com.fundoonotes.dto.request.LoginRequestDto;
import com.fundoonotes.dto.request.RegisterRequestDto;
import com.fundoonotes.dto.request.ResetPasswordRequestDto;
import com.fundoonotes.dto.response.AuthResponseDto;
import com.fundoonotes.service.impl.UserServiceImpl;

import jakarta.validation.Valid;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserServiceImpl userService;

    // Constructor Injection
    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }
    

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDto> register(@Valid @RequestBody RegisterRequestDto request) { 
        
    		String token = userService.register(request);
    		
        return ResponseEntity.status(HttpStatus.CREATED).body(new AuthResponseDto(token, "Registration Successful"));  
    }
    

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@Valid @RequestBody LoginRequestDto request) {
        
    		String token = userService.login(request); 
    		
        return ResponseEntity.ok(new AuthResponseDto(token, "Login Successful")); 
    } 
    
    
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
    
    
    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@Valid @RequestBody ForgotPasswordRequestDto request) {

        String resetToken = userService.forgotPassword(request);

        return ResponseEntity.ok("Reset token: " + resetToken);
    }
    
     
    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@Valid @RequestBody ResetPasswordRequestDto request) {

        userService.resetPassword(request);

        return ResponseEntity.ok("Password reset successful"); 
    }
}