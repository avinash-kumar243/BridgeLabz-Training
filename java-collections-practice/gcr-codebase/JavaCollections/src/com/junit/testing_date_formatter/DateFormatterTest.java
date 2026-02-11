package com.junit.testing_date_formatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateFormatterTest {
	
	private final DateFormatter dateFormatter = new DateFormatter();

	
	// Valid date test
	@Test
	void testValidDate() {
		assertEquals("12-02-2004", dateFormatter.formatDate("2004-02-12")); 
	}
	
	// Leap year test
	@Test
	void testLeapYear() {
		assertEquals("29-02-2012", dateFormatter.formatDate("2012-02-29"));
	}
	
	// Invalid date format check
	@Test
	void testInvalidFormat() {
		assertThrows(IllegalArgumentException.class, () -> {
			dateFormatter.formatDate("10-06-2025");
		});
	}
	
	// Invalid Date Value test
	@Test
	void testInvalidDateValue() {
		assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("2025-02-31")); 
	}
	
	// Null Date value test
	@Test
	void testNullDateInput() {
		assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(null));
	}
	
	// Empty input test
	@Test
	void testEmptyInput() {
		assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate(""));
	}
}