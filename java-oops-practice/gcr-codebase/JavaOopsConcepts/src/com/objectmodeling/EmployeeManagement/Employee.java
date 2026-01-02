package com.objectmodeling.EmployeeManagement;

public class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee name: " + name + " | id: " + id + " | salary: " + salary;
	}
}