package com.practice.greetings.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.greetings.dto.GreetingsRequestDto;
import com.practice.greetings.entity.Greeting;
import com.practice.greetings.repository.GreetingsRepository;

@Service
public class GreetingsService { 

    private final GreetingsRepository greetingsRepository;

    	// Constructor injection
    public GreetingsService(GreetingsRepository greetingsRepository) {
        this.greetingsRepository = greetingsRepository;
    } 
    

    // Create Greetings
    public void createGreeting(GreetingsRequestDto request, String name) {

        Greeting greeting = new Greeting();

        greeting.setName(name);
        greeting.setMessage(request.getMessage());
        greeting.setCreatedAt(LocalDateTime.now());

        greetingsRepository.save(greeting); 
    }

    // Get All greetings
    public List<Greeting> getAllGreetings() { 
        return greetingsRepository.findAll(); 
    }

    // Delete all greetings
    public void deleteAllGreetings() {
    		greetingsRepository.deleteAll(); 
    }
}