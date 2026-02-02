package com.questions.functionalinterface.consumer.employee;

import java.time.LocalTime;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Avi", "101", LocalTime.of(10, 25)),
										   new Employee("Mohan", "102", LocalTime.of(06, 45)),
										   new Employee("Komal", "103", LocalTime.of(12, 00)),
										   new Employee("Shivam", "104", LocalTime.of(11, 20)),
										   new Employee("Madan", "105", LocalTime.of(04, 30)));
		
		
		// Log employee login activity using Consumer
		System.out.println("------------ Log employee login activity using Consumer -------------\n");
		
		Consumer<Employee> printLoginInfo = employee -> System.out.println(employee);
		
		employees.stream()
				 .forEach(printLoginInfo);
	}
}