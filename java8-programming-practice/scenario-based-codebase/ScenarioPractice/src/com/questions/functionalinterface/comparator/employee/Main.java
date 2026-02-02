package com.questions.functionalinterface.comparator.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Avi", 10000),
												 new Employee("Aman", 40000),
												 new Employee("Allu", 30000),
												 new Employee("Komal", 25000),
												 new Employee("Deepak", 55000));
		
		
		// Compare two employees by salary.

		employees.stream()
				 .sorted(Comparator.comparing(Employee::getSalary))
				 .forEach(System.out::println);
	}
}