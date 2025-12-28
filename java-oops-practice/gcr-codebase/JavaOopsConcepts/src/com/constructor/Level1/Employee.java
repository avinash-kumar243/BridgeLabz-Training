package com.constructor.Level1;

public class Employee {
	public long employeeID;
	protected String department;
	private double salary;
	
	// Parameterized Constructor
	public Employee(long employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	// get salary
	public double getSalary() {
		return salary;
	}
	
	// set salary
	public void setSalary(double newSalary) {
		if(newSalary >= 0) {
			salary += newSalary;
			System.out.println("Employee Salary updated");
		}
		else System.out.println("Invalid salary!");
	}
	
	// Display Employee details
	public void displayEmployee() {
		System.out.println("Employee id : " + employeeID);
		System.out.println("Employee department : " + department);
		System.out.println("Employee salary : " + salary + "\n");
	}
}