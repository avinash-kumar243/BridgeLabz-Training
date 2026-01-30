package com.lambdaexpressions.nameuppercasing;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("101", "Avi"),
												 new Employee("102", "Deepak"),
												 new Employee("103", "Shivani"),
												 new Employee("104", "Deepu"));
		
		System.out.println("\nAll employees name in UpperCase: ");
		employees.stream()
				 .map(Employee::getEmployeeName)
				 .map(String::toUpperCase) 
				 .forEach(System.out::println);	
	}
}