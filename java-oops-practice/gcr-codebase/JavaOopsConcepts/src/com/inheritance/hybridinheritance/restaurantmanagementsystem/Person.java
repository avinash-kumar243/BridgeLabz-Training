package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Person {
	protected String name;
	protected int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void showDetails() {
		System.out.println("Name: " + name + " || id: " + id);
	}
}