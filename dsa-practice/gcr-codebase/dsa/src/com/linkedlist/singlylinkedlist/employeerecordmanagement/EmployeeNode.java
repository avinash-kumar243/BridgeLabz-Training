package com.linkedlist.singlylinkedlist.employeerecordmanagement;

class EmployeeNode {
	protected int id;
	protected String name;
	protected String department;
	protected int salary;
	EmployeeNode next;
	
	public EmployeeNode(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.next = null;
	}
}