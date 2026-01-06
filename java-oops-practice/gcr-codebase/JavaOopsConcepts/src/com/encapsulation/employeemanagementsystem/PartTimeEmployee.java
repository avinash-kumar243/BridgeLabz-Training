package com.encapsulation.employeemanagementsystem;

public class PartTimeEmployee extends Employee {
	private double workHours, hourlyRate;
	
	public PartTimeEmployee(int employeeId, String name, double baseSalary, double workHours, double hourlyRate) {
		super(employeeId, name, baseSalary);
		this.workHours = workHours;
		this.hourlyRate = hourlyRate;
	} 

	@Override
	public double calculateSalary() {
		return baseSalary + (workHours * hourlyRate);
	}
}