package com.constructor.Level1;

public class DisplayEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee(103L, "CSE", 10000);
		emp.displayEmployee();
		
		emp.setSalary(50000);
		System.out.println("Employee new salary is : " + emp.getSalary() + "\n");
		
		
		Manager manager = new Manager(101L, "IT", 8000);
		manager.displayEmployee();
	}
}