package com.linkedlist.singlylinkedlist.employeerecordmanagement;

public class SearchEmployee {
	public static void displayEmployee(int id, EmployeeNode head) {
		
		// Base case for single or multiple employees
		if(head == null) return;
		
		EmployeeNode temp = head; 
		while(temp != null && temp.id != id) {
			temp = temp.next;
		}
		
		if(temp != null) {
			System.out.println("Employee with id: " + id + " details are :- \n"); 
			System.out.println("Employee Name is : " + temp.name);
			System.out.println("Employee Department is : " + temp.department);
			System.out.println("Employee Salary is : " + temp.salary);
		} else { 
			System.out.println("Invalid given id. Employee not found");
		}
	}
}