package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.model.Contact;

@Repository  // Spring Data JPA operations like save(), findById(), findAll(), deleteById(), existsById(), count() 
public interface UserRepository extends JpaRepository<Contact, Long> {
	
	Contact findByEmail(String email);
	
	
}