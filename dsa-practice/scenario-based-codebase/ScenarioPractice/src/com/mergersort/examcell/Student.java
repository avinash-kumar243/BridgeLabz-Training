package com.mergersort.examcell;

// Student class
public class Student {
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}	
	
	
	// Getters for student name and marks
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	

	@Override
	public String toString() {
		return "Student name: " + name + " || Student marks: " + marks; 
 	}
}