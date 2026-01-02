package com.inheritance.Employee;

public class Manager extends Employee {
	private int teamSize;

	public Manager(String name, String id, double salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: Manager | Team size is : " + teamSize + "\n");
	}
}