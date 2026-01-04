package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class RemoveStudent {
	public static Student deleteStudent(int roll, Student head) {
		if(head == null) return null;
		if(head.roll == roll) {
            return head.next;
        }
		
		Student student = head;
		while(student.next != null && student.next.roll != roll) {
			student = student.next;
		}
		
		if(student.next == null) {
			System.out.println("Student with roll " + roll + " not found.");
            return head;
		}

		student.next = student.next.next;
		return head;
	}
}