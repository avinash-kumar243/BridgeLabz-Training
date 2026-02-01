package com.collectors.studentresultgrouping;

public class Student {
	private int roll;
	private String name;
	private char grade;
	
	public Student(int roll, String name, char grade) {
		this.roll = roll;
		this.name = name;
		this.grade = grade;
	}

	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public char getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", grade=" + grade + "]";
	}
}