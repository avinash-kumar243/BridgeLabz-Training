package com.inheritance.Employee;

public class Main {
	public static void main(String args[]) {
		Employee e1 = new Manager("Riya", "100", 40000, 5);
		Employee e2 = new Developer("Avi", "200", 30000, "Java");
		Employee e3 = new Manager("Mohan", "400", 10000, 3);
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}