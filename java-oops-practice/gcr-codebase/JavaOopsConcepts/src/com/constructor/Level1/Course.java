package com.constructor.Level1;

public class Course {
	private String courseName;
	private int duration;
	private int fee;
	private static String instituteName = "Allu University";
	
	// Parameterized Constructor
	public Course(String courseName, int duration, int fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	// Instance methods
	public void displayCourseDetails() {
		System.out.println("\nCourse name is : " + courseName);
		System.out.println("Course duration is : " + duration);
		System.out.println("Course fee is : " + fee);
	}
	
	// Class methods
	public static void printInstituteName() {
		System.out.println("\nInstitute name is : " + instituteName);
	}
	public static void updateInstituteName(String name) {
		instituteName = name;
	}
}