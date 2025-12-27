package com.classandobject.Level2;

public class StudentGrade {
	private String name;
	private String roll;
	private double marks[];
	
	public StudentGrade(String name, String roll, double marks[]) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
		
	// Calculate total marks and grade based on it
	public String calculateGrade(double[] marks ) {
		double totalMarks = calculateTotalMarks(marks);
		
		//to check the grade of student
		if(totalMarks >= 80 && totalMarks<=100) {
			return "Grade A";
		}
		else if((totalMarks >=60)&&(totalMarks <80)){
			return "Grade B";
		}
		else if((totalMarks >=50)&&(totalMarks <60)) {
			return "Grade C";
		}
		else if((totalMarks >=40)&&(totalMarks <50)) {
			return "Grade D";
		}
		else {
			return "Grade F";
		}
	} 
	public double calculateTotalMarks(double marks[]) {
		double totalMarks = 0;
		for(int i=0; i<marks.length; i++) {
			totalMarks += marks[i];
		}
		return totalMarks / 3;
	}
	
	// Display student details
	public void displayStudent() {
		System.out.println("Student Name: "+name);
				
		System.out.println("Student RollNumber : " + roll);
		System.out.println("Student Marks :");
		
		for(int i=0; i<marks.length ; i++) {
			System.out.println("Mark" + (i+1) + " : " + marks[i]);
		}
		System.out.println(calculateGrade(marks));
		
		System.out.println("...............................");
	}
}