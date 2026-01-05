package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class AddStudent {

	// Add a student at beginning
	public static Student AddStudentAtBeginning(Student newNode, Student head) {
		if(head == null) return newNode;

		newNode.next = head;
		return newNode; 
	}
	
	// Add a student at index 
	public static Student AddStudentAtMiddle(Student newStudent, int idx, Student head) {
		if(head == null) return newStudent;
		if(head.next == null && idx == 1) { 
			newStudent.next = head;
			return newStudent;
		}
		 
		Student temp = head;
		int i = 1;
		while(temp.next != null && i < idx-1) {
			i++;
			temp = temp.next;
		}
		newStudent.next = temp.next;
		temp.next = newStudent;
		
		return head;
	}
		
		
	// Add a student at end 
	public static Student AddStudentAtEnd(Student newStudent, Student head) {
		if(head == null) return newStudent;
		
		Student temp = head;
		while(temp.next != null) {
			temp = temp.next; 
		}
		temp.next = newStudent;
		
		return head;
	}
}
