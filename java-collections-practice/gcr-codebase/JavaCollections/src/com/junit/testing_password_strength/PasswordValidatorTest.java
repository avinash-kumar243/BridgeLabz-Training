package com.junit.testing_password_strength;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {
	
	PasswordValidator validator;

	@BeforeEach
	void setUp() throws Exception {
		validator = new PasswordValidator();
	}
	
	
	@Test
	void testValidPassword() {
		assertTrue(validator.passwordValidator("Avinash76"));
	}
	
	@Test
	void testNoUpperCase() {
		assertFalse(validator.passwordValidator("avinash76"));
	}
	
	@Test
	void testNoDigit() {
		assertFalse(validator.passwordValidator("AvinashKumar"));
	}
	
	@Test 
	void testShortPassword() {
		assertFalse(validator.passwordValidator("Avi23"));
	}
	
	
	@Test
	void testNullPointerException() {
		NullPointerException exception = assertThrows(NullPointerException.class, () -> validator.passwordValidator(null));
		
		assertEquals("Password is null!!!", exception.getMessage());
	}
}