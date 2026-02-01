package com.questions.functionalinterface.predicate.studentsystem;

public class Student {
	private String name;
	private int attendence;
	
	public Student(String name, int attendence) {		
		this.name = name;
		this.attendence = attendence;
	}

	public String getName() {
		return name;
	}
	public int getAttendence() {
		return attendence;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", attendence=" + attendence + "]";
	}
}