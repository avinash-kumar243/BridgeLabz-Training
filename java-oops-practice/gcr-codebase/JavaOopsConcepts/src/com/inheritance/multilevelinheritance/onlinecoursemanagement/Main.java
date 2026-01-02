package com.inheritance.multilevelinheritance.onlinecoursemanagement;

public class Main {
	public static void main(String args[]) {
		Course c1 = new Course("Java", 10);
		OnlineCourse c2 = new OnlineCourse("Java", 10, "Apna college", true);
		PaidOnlineCourse c3 = new PaidOnlineCourse("Java", 10, "Code with Harry", false, 10000, 1000);
		
		System.out.println("\n--------- Java Course ----------");
		c1.showDetails();
		
		System.out.println("\n--------- Online Java Course ----------");
		c2.showDetails();
		
		System.out.println("\n--------- Java Course ----------");
		c3.showDetails();
	}
}