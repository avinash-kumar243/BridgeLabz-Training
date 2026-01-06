package com.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
	private double monthlyBonus;
		
	public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlyBonus) {
		super(employeeId, name, baseSalary);
		this.monthlyBonus = monthlyBonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + monthlyBonus;
	}

	
}