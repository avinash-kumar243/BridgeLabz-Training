package com.javadesignpattern.practice.ocp;

public class ContractedEmployee extends Employee {
	
	public ContractedEmployee(double baseSalary) {
		super(baseSalary);
	}	
	
	@Override
	public double calculateSalary() {
		return baseSalary * 1.5; 
	}
}