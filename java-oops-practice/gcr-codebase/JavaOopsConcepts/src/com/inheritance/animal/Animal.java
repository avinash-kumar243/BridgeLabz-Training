package com.inheritance.animal;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	protected void makeSound() {
		System.out.println("Animal sound");
	}

	public void showInfo() {
		System.out.println("Animal name is : " + name + " and age is : " + age);
	}
}