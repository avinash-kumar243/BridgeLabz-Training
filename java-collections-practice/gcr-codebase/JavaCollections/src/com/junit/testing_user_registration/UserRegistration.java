package com.junit.testing_user_registration;

public class UserRegistration {
	
	public boolean registerUser(String username, String email, String password) {
		
		validateUsername(username);
		validateEmail(email);
		validatePassword(password);
		
		return true; // Registration successful
	}
	
	// Method to validate username
	private void validateUsername(String username) {
		if(username == null || username.trim().isEmpty()) {
			throw new IllegalArgumentException("Username can't be null or empty");
		}
		
		if(username.length() < 4) {
			throw new IllegalArgumentException("Username must have at lest 4 characters");
		}
	}
	
	// Method to validate email
	private void validateEmail(String email) {
		if(email == null || email.trim().isEmpty()) {
			throw new IllegalArgumentException("Email can't be null or empty");
		}
		
		if(!email.contains("@") || !email.contains(".")) {
			throw new IllegalArgumentException("Invalid email");
		} 
	}
	
	// Method to validate password
	private void validatePassword(String password) {
		if(password == null || password.trim().isEmpty()) {
			throw new IllegalArgumentException("Password can't be null or empty");
		}
		
		if(password.length() < 8) {
			throw new IllegalArgumentException("Password must have at lest 8 characters");
		}
	}
}