package com.inheritance.hierarchicalinheritance.schoolmanagementsystem;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Aman", 22);
		p1.displayDetails();
		
		System.out.println("\n--------- Teacher ---------");
		Teacher t1 = new Teacher("Mohan", 28, "History");
		t1.displayRole();
		t1.displayDetails();
		
		System.out.println("\n--------- Student ---------");
		Student s1 = new Student("Geeta", 21, "B");
		s1.displayRole();
		s1.displayDetails();
		
		System.out.println("\n--------- Staff ---------");
		Staff s2 = new Staff("Dipu", 34, 8);
		s2.displayRole();
		s2.displayDetails();
	}
}