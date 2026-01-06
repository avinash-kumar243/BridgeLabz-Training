package com.encapsulation.employeemanagementsystem;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee(101, "Mohan", 20000, 4000);
		emp1.assignDepartment("EC");
		
		Employee emp2 = new PartTimeEmployee(102, "Deepika", 10000, 40, 100);
		emp2.assignDepartment("IT");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		
		System.out.println("Employee Details : \n");
		
		for(Employee e : employees) {
			e.displayDetails();
		}
	}
}