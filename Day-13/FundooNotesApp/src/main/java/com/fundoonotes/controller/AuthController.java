package com.fundoonotes.controller;

import com.fundoonotes.dto.AuthResponseDto;
import com.fundoonotes.dto.LoginRequestDto;
import com.fundoonotes.dto.RegisterRequestDto;
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
}