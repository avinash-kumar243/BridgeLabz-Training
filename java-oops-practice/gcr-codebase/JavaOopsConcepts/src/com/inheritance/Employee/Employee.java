package com.inheritance.Employee;

public class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name: " + name + ", id: " + id + ", and salary: " + salary);
	}
}