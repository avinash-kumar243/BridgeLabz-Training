package com.inheritance.hierarchicalinheritance.schoolmanagementsystem;

public class Staff extends Person {
	protected int dutyHours;

	public Staff(String name, int age, int dutyHours) {
		super(name, age);
		this.dutyHours = dutyHours;
	}
	
	public void displayRole() {
		System.out.println("Role: Staff");
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Total duty hours: " + dutyHours);
	}
}
