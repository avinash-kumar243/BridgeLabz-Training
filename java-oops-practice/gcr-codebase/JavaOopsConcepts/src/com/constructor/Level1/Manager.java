package com.constructor.Level1;

public class Manager extends Employee {

	// Parameterized Constructor
	public Manager(long employeeID, String department, double salary) {
		super(employeeID, department, salary);
	}
	
	@Override
	public void displayEmployee() {
		System.out.println("Employee id is : " + super.employeeID);
		System.out.println("Employee department is : " + super.department);
		System.out.println("Employee salary is : " + super.getSalary());
	}
}