package com.junit.testing_temperature_converter;

public class TemperatureConverter {
	
	// Method to calculate temperature in Fahrenheit from Celsius
	public double celsiusToFahrenheit(double celsius) {
		return (1.8 * celsius) + 32;
	}
	
	// Method to calculate temperature in Celsius from Fahrenheit
	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * (5 / 9.0);
	}
}