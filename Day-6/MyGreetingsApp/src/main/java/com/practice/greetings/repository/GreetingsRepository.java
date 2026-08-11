package com.practice.greetings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.greetings.entity.Greeting;

public interface GreetingsRepository extends JpaRepository<Greeting, Long> {
	
} 