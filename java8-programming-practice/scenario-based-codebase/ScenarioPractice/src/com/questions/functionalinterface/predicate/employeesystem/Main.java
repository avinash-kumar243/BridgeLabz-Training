package com.questions.functionalinterface.predicate.employeesystem;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Komal", 20000);
		Employee emp2 = new Employee("Ravi", 45000);
		
		
		// In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).
		Predicate<Employee> p = emp -> emp.getSalary() > 30000;
		
		System.out.println("Does Komal salary greater than 30,000 -> " + p.test(emp1));
		System.out.println("Does Ravi elegible for exam -> " + p.test(emp2));
	}
}