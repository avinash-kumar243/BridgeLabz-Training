package com.javadesignpattern.practice.ocp;

public class PartTimeEmployee extends Employee {
		
	public PartTimeEmployee(double baseSalary) {
		super(baseSalary);
	}

	@Override
	public double calculateSalary() {
		return baseSalary * 0.5; 
	}
}