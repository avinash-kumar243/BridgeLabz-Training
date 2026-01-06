package com.encapsulation.employeemanagementsystem;

public abstract class Employee implements Department {
	private int employeeId;
	private String name;
	protected double baseSalary;
	protected String department; 
	
	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public void assignDepartment(String department) {
		 this.department = department;
	}

	@Override
	public String getDepartmentDetails() {
		return "Department name is: " + department;
	} 


	public abstract double calculateSalary();
	
	public void displayDetails() {
		System.out.println("Employee id: " + employeeId);
		System.out.println("Employee name: " + name);
		System.out.println("Employee baseSalary: " + baseSalary);
		
		System.out.println(getDepartmentDetails());
		System.out.println("Final Salary: " + calculateSalary() + "\n");
	}
}