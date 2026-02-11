package com.junit.testing_user_registration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	private final UserRegistration user = new UserRegistration();
	
	// Test Valid User Registartion
	@Test
	void testValidUserRegistration() {
		assertTrue(user.registerUser("Avinash", "avinash@gmail.com", "Avinash123"));
	}
	
	// Test invalid Username -> too short username
	@Test
	void testInvalidUsernameTooShort() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser("Avi", "avi@gmail.com", "avi12345"));
	}
	
	
	// Test null username
	@Test
	void testNullUsername() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser(null, "null@gamil.com", "null1234"));
	}
	
	
	// Test invalid email
	@Test
	void testInvalidEmailFormat() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser("Avinash", "avinashemail", "avin11234"));
	}
	
	
	// Test empty email
	@Test
	void testEmptyEmail() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser("Avinash", "", "avin11234"));
	}
	
	
	// Test too short password
	@Test
	void testPasswordTooShort() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser("Avinash", "null@gamil.com", "avi12"));
	}
	
	
	// Test null password
	@Test
	void testNullPassword() {
		assertThrows(IllegalArgumentException.class, () -> user.registerUser("Avinash", "null@gamil.com", null));
	}
}