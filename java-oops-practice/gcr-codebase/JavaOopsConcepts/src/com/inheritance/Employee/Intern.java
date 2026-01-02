package com.inheritance.Employee;

public class Intern extends Employee {
	private String name;
	private String id;
	private double salary;
	private int duration;
	
	public Intern(String name, String id, double salary, int duration) {
		super(name, id, salary);
		this.duration = duration;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: Intern | Duration: " + duration + "\n");
	}
}