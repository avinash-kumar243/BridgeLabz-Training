package com.constructor.Level1;

public class DisplayStudent {
	public static void main(String[] args) {
		
		// Student Object
		Student s = new Student(10, "Vikram", 6.9);
		s.showStudentDetails();
		
		// Get and Set CGPA
		System.out.println("Student Old CGPA is : " + s.getCgpa());
		s.setCgpa(9.4);
		System.out.println("Student New CGPA is : " + s.getCgpa());
		
		
		
		// Sub-class Object
		PostgraduateStudent p = new PostgraduateStudent(8, "Deepika", 9.8);
		p.showStudentDetails();
		
		// Get and Set CGPA
		System.out.println("PG Student Old CGPA is : " + s.getCgpa());
		s.setCgpa(9.4);
		System.out.println("PG Student New CGPA is : " + s.getCgpa());
	}
}