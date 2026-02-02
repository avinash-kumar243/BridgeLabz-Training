package com.questions.functionalinterface.function.employee;

import java.util.function.Function;

public class EmployeeMain {
	public static void main(String[] args) {
		
		// Convert employee name into uppercase.
		System.out.println("------------- Converting employee name into uppercase -----------\n");
		
		// Function to convert name into uppercase
		Function<String, String> f = name -> name.toUpperCase();
		
		
		System.out.println("Name: Avinash kumar \nName in uppercase: " + f.apply("Avinash kumar"));
	}
}