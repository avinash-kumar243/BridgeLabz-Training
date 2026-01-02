package com.objectmodeling.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private List<Employee> employees;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}

	public void addEmployee(String empName, String id, double salary) {
		Employee emp = new Employee(empName, id, salary);
		employees.add(emp);	
	}

	public void showEmployee() {
		System.out.println("Department : " + name);
		for(Employee emp : employees) {
			System.out.println(" - " + emp);
		}
	}
	
}