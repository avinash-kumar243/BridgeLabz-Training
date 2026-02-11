package com.junit.testing_temperature_converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
	
	TemperatureConverter tempConverter;

	@BeforeEach
	void setUp() throws Exception {
		tempConverter = new TemperatureConverter();
	}

	@Test
	void testCelsiusToFahrenheit() {
		double celsius = 100;
		assertEquals(212, tempConverter.celsiusToFahrenheit(celsius));
	}
	
	@Test
	void testFahrenheitToCelcius() {
		double fahrenheit = 230;
		assertEquals(110, tempConverter.fahrenheitToCelsius(fahrenheit));
	}
}