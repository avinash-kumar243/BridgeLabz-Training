package com.questions.functionalinterface.function.temperature;

import java.util.function.Function;

public class TemperatureConvertor {
	public static void main(String[] args) {
		
		// Convert Celsius temperature into Fahrenheit.
		System.out.println("---------------- Conversion of  Celsius temperature into Fahrenheit ---------------");
		Function<Double, Double> f = temperature -> temperature * 1.8 + 32;
		
		
		System.out.println("32 degree Celsius in Fahrenheit -> " + f.apply(32.0));
		System.out.println("45 degree Celsius in Fahrenheit -> " + f.apply(45.0));
	}
} 