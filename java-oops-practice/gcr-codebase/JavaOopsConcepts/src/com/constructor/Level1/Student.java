package com.constructor.Level1;

public class Student {
	public int rollNumber;  // Public : Accessible Everywhere
	protected String name;  // Protected : Accessible in same package and subclass 
	private double cgpa;    // private : Accessible only inside this class
	
	// Parameterized Constructor
	public Student(int roll, String name, double cgpa) {
		this.rollNumber = roll;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	// Setter and Getter for CGPA
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		if(cgpa >= 0.0 && cgpa <= 10) this.cgpa = cgpa;
		else System.out.println("Invalid CGPA!");
	}
	
	// Show Student details
	public void showStudentDetails() {
		System.out.println("\nStundent name is : " + name);
		System.out.println("roll number is : " + rollNumber);
		System.out.println("CGPA is : " + cgpa + "\n");
	}
}