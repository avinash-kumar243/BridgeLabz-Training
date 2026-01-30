package com.interfaces.functionalinterface.temperaturealertsystem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TemperatureMain {
	public static void main(String[] args) {
		List<Double> temperatures = Arrays.asList(34.6, 41.2, 39.4, 40.3, 37.9, 38.2);
		
		double threshold = 38;
		
		Predicate<Double> p = temperature -> temperature > threshold;
		
		System.out.println("The temperatures who crossed thresold value are: ");
		temperatures.stream()
					.filter(p)
					.forEach(System.out::println);		
	}
}