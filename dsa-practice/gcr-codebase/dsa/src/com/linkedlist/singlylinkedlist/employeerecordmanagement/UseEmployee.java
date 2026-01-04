package com.linkedlist.singlylinkedlist.employeerecordmanagement;

public class UseEmployee {
	public static void main(String[] args) {
		// Creating head node
		EmployeeNode head = new EmployeeNode(3, "Allu", "CSE", 10000);
		
		// Addition of Employees
		System.out.println("\n------- Addition of an Employee and displaying all employees data -------\n");
		head = AddEmployee.addEmployeeAtHead(2, "Sonu", "IT", 8000, head);
		head = AddEmployee.addEmployeeAtHead(1, "Ruchika", "AIML", 15000, head);
		head = AddEmployee.addEmployeeAtTail(4, "Deepanshu", "IT", 12400, head);
		
		// Displaying Employee data
		DisplayEmployee.displayEmployee(head);
		
		
		// Deletion of Employee by id
		System.out.println("\n------- Deletion of an Employee and displaying remaining all employees data -------\n");
		head = DeleteEmployee.deleteEmployee(4, head);
		DisplayEmployee.displayEmployee(head);
		
		
		// Search an Employee
		System.out.println("\n------- Searching an Employee by their id and displaying that employee data -------\n");
		SearchEmployee.displayEmployee(2, head);
	}
}