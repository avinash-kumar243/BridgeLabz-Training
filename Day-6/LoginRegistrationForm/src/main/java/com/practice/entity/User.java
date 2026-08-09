package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// This is our model/entity. It represents an user in the application.
// Because this class is marked as "@Entity", so JPA represent this class as database entity.
// The id is primary key that automatically increase when a new user add.
// The remaining three fields of this entity represents as registration data

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String email;
    private String password;
    
}