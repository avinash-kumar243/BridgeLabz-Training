package com.practice.srp;

public class Employee {
	private String name;
	private int id;
	private double baseSalary;
	private String employeeType;
	
	public Employee(String name, int id, double baseSalary, String employeeType) {
		this.name = name;
		this.id = id;
		this.baseSalary = baseSalary;
		this.employeeType = employeeType;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
}