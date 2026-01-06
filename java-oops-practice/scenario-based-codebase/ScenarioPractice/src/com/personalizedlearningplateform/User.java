package com.personalizedlearningplateform;

public abstract class User {
	private String name;
	private String email;
	private String id;
	
	public User(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	
}