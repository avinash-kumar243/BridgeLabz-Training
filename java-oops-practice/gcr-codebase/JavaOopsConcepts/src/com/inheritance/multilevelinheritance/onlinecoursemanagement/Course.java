package com.inheritance.multilevelinheritance.onlinecoursemanagement;

public class Course {
	protected String courseName;
	protected int duration;
	
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public String getCourseType() {
		return "General Course";
	}
	
	public void showDetails() {
		System.out.println("Course name: " + courseName + " || duration:" + duration);
	}
}