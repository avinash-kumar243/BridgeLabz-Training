package com.practice.ocp;

// Follows Open/Closed Design Principles (OCP) :- 
abstract class Employee {
	protected double baseSalary;
	
	public Employee(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// Abstract method to  calculate salary
	abstract double calculateSalary();
}