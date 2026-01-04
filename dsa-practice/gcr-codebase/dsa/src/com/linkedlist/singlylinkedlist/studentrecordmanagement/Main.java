package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
	public static void main(String[] args) {
		Student head = new Student("Avi", 10, 22, "B");
		
		System.out.println("\n----------- Addition of students ------------\n");
		head = AddStudent.AddStudentAtBeginning(new Student("Deepak", 25, 21, "A"), head);
		head = AddStudent.AddStudentAtMiddle(new Student("Manoj", 56, 23, "A"), 2, head);
		head = AddStudent.AddStudentAtEnd(new Student("Geeta", 28, 22, "C"), head);
		
		DisplayStudents.display(head);
		
		
		System.out.println("\n----------- Deletion of students ------------\n");
		Student removedStudent = RemoveStudent.deleteStudent(28, head);
		System.out.println("Student deleted.\n");
		DisplayStudents.display(removedStudent);
		
		System.out.println("\n------ Search Student --------\n");
		Student result = SearchStudent.searchByRoll(25, head);

		if(result != null) {
		    System.out.println("Student Found:");
		    DisplayStudents.display(result);
		} else {
		    System.out.println("Student not found.");
		}

		System.out.println("\n------ Update Grade --------\n");
		boolean updated = UpdateGrade.updateGrade(56, "A", head);

		if(updated) {
		    System.out.println("Grade updated successfully.");
		} else {
		    System.out.println("Student not found.");
		}
		
		System.out.println("\n------ Final Student List --------\n");
		DisplayStudents.display(head);
	}
}