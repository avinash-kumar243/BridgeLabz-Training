package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Deepanshu", 101);
		p1.showDetails();
		
		System.out.println("\n------------- Chef ------------");
		Chef c1 = new Chef("Mohan", 102, "Italian Cuisine");
		c1.showDetails();
		c1.performDuties();
		
		System.out.println("\n------------- Waiter ------------");
		Waiter w1 = new Waiter("Golu", 103, 4);
		w1.showDetails();
		w1.performDuties();
	}
}