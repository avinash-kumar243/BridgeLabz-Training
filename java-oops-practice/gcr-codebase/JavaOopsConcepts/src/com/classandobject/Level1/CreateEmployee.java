package com.classandobject.Level1;

public class CreateEmployee {
	int id;
	String name;
	int salary;
	
	public CreateEmployee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void display() {
		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is : " + name);
		System.out.println("Employee salary is : " + salary);
	}
}
