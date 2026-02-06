package com.javadesignpattern.practice.srp;

// A single responsibility to calculate employee salary
public class SalaryCalculation {
	public double calculateSalary(Employee employee) {
		if(employee.getEmployeeType().equalsIgnoreCase("FullTime")) {
			return employee.getBaseSalary() * 1.0;
		} else if(employee.getEmployeeType().equalsIgnoreCase("PartTime")) {
			return employee.getBaseSalary() * 0.6;
		} else if(employee.getEmployeeType().equalsIgnoreCase("Contract")) {
			return employee.getBaseSalary() * 1.5;
		}
		return 0; // For invalid employee type
	}
}