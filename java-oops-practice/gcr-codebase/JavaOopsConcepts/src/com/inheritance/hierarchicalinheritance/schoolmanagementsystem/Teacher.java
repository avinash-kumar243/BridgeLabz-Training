package com.inheritance.hierarchicalinheritance.schoolmanagementsystem;

public class Teacher extends Person {
	protected String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void displayRole() {
		System.out.println("Role: Teacher");
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Subject: " + subject);
	}
}