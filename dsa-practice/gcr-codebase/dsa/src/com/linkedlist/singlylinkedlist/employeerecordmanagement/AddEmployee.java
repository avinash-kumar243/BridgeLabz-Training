package com.linkedlist.singlylinkedlist.employeerecordmanagement;

public class AddEmployee {
	
	// Add Employee at beginning
	public static EmployeeNode addEmployeeAtHead(int id, String name, String department, int salary, EmployeeNode head) {
		EmployeeNode newEmployee = new EmployeeNode(id, name, department, salary);
		newEmployee.next = head;
		return newEmployee;
	}

	public static EmployeeNode addEmployeeAtTail(int id, String name, String department, int salary, EmployeeNode head) {
		EmployeeNode newEmployee = new EmployeeNode(id, name, department, salary);
		
		EmployeeNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newEmployee;
		return head;
	}
}