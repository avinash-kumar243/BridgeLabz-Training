package com.constructor.Level1;

public class DisplayPerson {
	private String name;
	private int age;
	private double bankbalance;
	
	public DisplayPerson(String name, int age, double bankbalance) {
		this.name = name;
		this.age = age;
		this.bankbalance = bankbalance;
	}
	
	public DisplayPerson(DisplayPerson person) {
		this.name = person.name;
		this.age = person.age;
		this.bankbalance = person.bankbalance;
	}
	
	protected void displayPersonDetails() {
		System.out.println("Person name is : " + name);
		System.out.println("Person age is : " + age);
		System.out.println("Person bankbalance is : " + bankbalance);
	}
}