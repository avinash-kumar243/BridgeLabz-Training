package com.linkedlist.singlylinkedlist.employeerecordmanagement;

public class DisplayEmployee {
	public static void displayEmployee(EmployeeNode head) {
		EmployeeNode temp = head;
		while(temp != null) {
			System.out.println("Id: " + temp.id);
			System.out.println("Name: " + temp.name);
			System.out.println("Department: " + temp.department);
			System.out.println("Salary: " + temp.salary + "\n");
			
			temp = temp.next;
		}
	}
}