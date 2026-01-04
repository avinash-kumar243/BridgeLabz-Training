package com.linkedlist.singlylinkedlist.employeerecordmanagement;

public class DeleteEmployee {
	
	// Delete Employee at beginning
	public static EmployeeNode deleteEmployee(int id, EmployeeNode head) {
		
		// Base case for single or multiple employees
		if(head == null || (head.id == id && head.next == null)) return null;
		if(head.id == id) return head.next;
		
		EmployeeNode temp = head; 
		while(temp.next != null && temp.next.id != id) {
			temp = temp.next;
		} 
		
		if(temp.next == null) {
			System.out.println("Invalid given id. Employee not found");
			return head;
		} else { 
			System.out.println("\nEmployee with id " + id + " have been deleted\n");
			temp.next = temp.next.next;
			return head; 
		}
	}
}