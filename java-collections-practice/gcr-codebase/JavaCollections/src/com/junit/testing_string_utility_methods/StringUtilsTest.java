package com.junit.testing_string_utility_methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
	
	StringUtils stringUtils;

	@BeforeEach
	void setUp() throws Exception {
		stringUtils = new StringUtils();
	}

	@Test
	void testReverseString() {
		assertEquals("olleH", stringUtils.reverseString("Hello"));
	}
	
	@Test
	void testPalindrome() {	
		assertEquals(true, stringUtils.isPalindrome("eye"));
	}
	
	@Test
	void testUpperCase() {
		assertEquals("ALLU ARJUN", stringUtils.toUpperCase("Allu Arjun"));
	}
} 