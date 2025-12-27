package com.classandobject.Level2;

public class Student {
	public static void main(String[] args) {
		double marks1[] = {70, 80, 90};
		double marks2[] = {79, 62, 65};
		
		// Object is created
		StudentGrade student1 = new StudentGrade("Thamarai", "ECE001", marks1);
		StudentGrade student2 = new StudentGrade("Kannan", "CSC002", marks2);
		
		//calling the display method
		student1.displayStudent();
		student2.displayStudent();
	}
}