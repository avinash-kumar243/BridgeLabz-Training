package com.questions.employee;

import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeDataList employeeList = new EmployeeDataList();
		
		employeeList.add(new Employee(101, "Avi", 24, "Male", "EC", 2024, 30000));
		employeeList.add(new Employee(102, "Mannu", 28, "Male", "CSE", 2024, 40000));
		employeeList.add(new Employee(103, "Deepika", 25, "Female", "IT", 2025, 35000));
		employeeList.add(new Employee(104, "Komal", 23, "Female", "CSE", 2024, 20000));
		employeeList.add(new Employee(105, "Shekhar", 27, "Male", "EC", 2023, 50000));
		employeeList.add(new Employee(106, "Vikki", 26, "Male", "CE", 2025, 60000));
		

		
		// Problem 1 :-  How many male and female employees are there in the organization?
		System.out.println(employeeList.employees.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting())));

	}
}