package com.javadesignpattern.practice.ocp;

public class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(double baseSalary) {
		super(baseSalary);
	}

	@Override
	public double calculateSalary() {
		return baseSalary * 1.0; 
	}
}