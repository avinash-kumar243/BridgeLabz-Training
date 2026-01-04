package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class AddStudent {

	// Add a student at beginning
	public static Student AddStudentAtBeginning(Student student, Student head) {
		if(head == null) return student;

		student.next = head;
		return student;
	}
	
	// Add a student at index
	public static Student AddStudentAtMiddle(Student student, int idx, Student head) {
		if(head == null) return student;
		if(head.next == null && idx == 1) { 
			student.next = head;
			return student;
		}
		
		Student temp = head;
		int i = 1;
		while(temp.next != null && i < idx-1) {
			i++;
			temp = temp.next;
		}
		student.next = temp.next;
		temp.next = student;
		
		return head;
	}
		
		
	// Add a student at end
	public static Student AddStudentAtEnd(Student student, Student head) {
		if(head == null) return student;
		
		Student temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = student;
		
		return head;
	}
}
