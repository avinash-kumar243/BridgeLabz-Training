package com.inheritance.hierarchicalinheritance.schoolmanagementsystem;

public class Student extends Person {
	protected String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	
	public void displayRole() {
		System.out.println("Role: Student");
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Grade: " + grade);
	}
}
