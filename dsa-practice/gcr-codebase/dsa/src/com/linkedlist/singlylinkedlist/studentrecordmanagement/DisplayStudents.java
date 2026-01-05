package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class DisplayStudents {
	public static void display(Student head) {
		Student student = head;
		
		while(student != null) {
			System.out.println("Student details are :- \n");
			System.out.println("Student name : " + student.name);
			System.out.println("Student roll number : " + student.roll);
			System.out.println("Student age : " + student.age);
			System.out.println("Student grade : " + student.grade);
			
			student = student.next;
		}
	}

	public static void displayStudent(Student result) {
		System.out.println("Student details are :- \n");
		System.out.println("Student name : " + result.name);
		System.out.println("Student roll number : " + result.roll);
		System.out.println("Student age : " + result.age);
		System.out.println("Student grade : " + result.grade);
	}
}