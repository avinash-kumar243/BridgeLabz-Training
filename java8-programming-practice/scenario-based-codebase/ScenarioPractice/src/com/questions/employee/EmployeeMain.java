package com.questions.employee;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeDataList employeeList = new EmployeeDataList();
		
		employeeList.add(new Employee(101, "Avi", 24, "Male", "EC", 2012, 30000));
		employeeList.add(new Employee(102, "Mannu", 28, "Male", "CSE", 2018, 40000));
		employeeList.add(new Employee(103, "Deepika", 25, "Female", "IT", 2025, 35000));
		employeeList.add(new Employee(104, "Komal", 23, "Female", "CSE", 2014, 20000));
		employeeList.add(new Employee(105, "Shekhar", 27, "Male", "EC", 2023, 50000));
		employeeList.add(new Employee(106, "Vikki", 26, "Male", "CE", 2015, 60000));
		
		
		// Actual work :- 
		
		// Problem 1 :-  How many male and female employees are there in the organization?
		System.out.print("Count of all male and female employees are: "); 
		System.out.println(employeeList.employees.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting())));
		
		
		// Problem 2 :- Print the name of all departments in the organization?
		System.out.print("All departments name in the organization are: "); 
		employeeList.employees.stream().map(Employee -> Employee.getDepartment()).distinct().toList().forEach(System.out::println);
		
		

		// Problem 3 :- What is the average age of male and female employees ?
		System.out.print("Average age of male and female are: "); 
		System.out.println(employeeList.employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
		
		
		// Problem 4 :- Get the details of highest paid employee in the organization?
		Optional<Employee> h = employeeList.employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(h);
		
		
	}
}