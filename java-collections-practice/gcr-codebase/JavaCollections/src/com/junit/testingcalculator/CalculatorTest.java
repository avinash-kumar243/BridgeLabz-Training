package com.junit.testingcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator cal;
	
	@BeforeEach
	void setUp() throws Exception {
		cal = new Calculator();
	}
 
	@Test
	void testAdd() {
		assertEquals(10, cal.add(4, 6));
	}
	
	@Test
	void testSubtract() {
		assertEquals(12, cal.subtract(20, 8)); 
	}
	
	@Test
	void testMultiply() {
		assertEquals(24, cal.multiply(8, 3));
	}
	
	@Test
	void testDivide() { 
		assertEquals(40, cal.divide(80, 2));
	}
}