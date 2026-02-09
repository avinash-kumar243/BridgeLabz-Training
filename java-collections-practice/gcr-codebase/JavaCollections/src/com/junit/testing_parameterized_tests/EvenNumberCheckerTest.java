package com.junit.testing_parameterized_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenNumberCheckerTest {
	
	EvenNumberChecker evenChecker;

	@BeforeEach
	void setUp() throws Exception {
		evenChecker = new EvenNumberChecker();
	}

	@ParameterizedTest
	@ValueSource(ints = {5, 10, 8, 3, 6})
	void testEven(int number) {
		if(number % 2 == 0) {
			assertTrue(evenChecker.isEven(number));
		} else {
			assertFalse(evenChecker.isEven(number));
		}
	}
}