package com.questions.lambdaexpression.employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("101", 50000, 5),
										   new Employee("102", 20000, 1),
										   new Employee("103", 100000, 6),
										   new Employee("104", 80000, 6),
										   new Employee("105", 55000, 4),
										   new Employee("106", 25000, 2),
										   new Employee("107", 10000, 1),
										   new Employee("108", 20000, 4),
										   new Employee("109", 45000, 2),
										   new Employee("110", 35000, 2),
										   new Employee("111", 60000, 6));
		
		// 1. Use lambda to calculate employee bonus (salary > 30,000).
		System.out.println("\n1. ------------- Calculating employee bonus (salary > 30,000) --------------");
		
		Predicate<Employee> p1 = employee -> employee.getSalary() > 30000;
		employees.stream()
				 .filter(p1)
				 .forEach(employee -> System.out.println("Bonus: 5000  ->  " + employee));
		
		
		// 2. Sort employees by salary using lambda.
		System.out.println("\n2. --------------- Sort employees by salary ------------------");
		employees.stream()
				 .sorted(Comparator.comparing(Employee::getSalary))
				 .forEach(employee -> System.out.println(employee));
		
		
		// 3. Use lambda to check promotion eligibility (experience > 3 years).
		System.out.println("\n3. -------------- Check promotion eligibility (experience > 3 years) ------------------");
		
		Predicate<Employee> p2 = employee -> employee.getExperience() > 3;
		employees.stream()
				 .filter(p2)
				 .forEach(employee -> System.out.println("Eligible for promotion  ->  " + employee));
		
		
		// 4. Use lambda to print employee details.
		System.out.println("\n4. --------------- Printing employee details --------------");
		employees.forEach(System.out::println);
		
		
		// 5. Use lambda to compare two employees’ salaries.
		System.out.println("\n5. --------------- Comparing two employees salaries ---------------");
		
		employees.stream()
				 .sorted(Comparator.comparing(Employee::getSalary))
				 .forEach(System.out::println);
	}
}