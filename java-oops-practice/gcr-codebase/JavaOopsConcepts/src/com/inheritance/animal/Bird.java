package com.inheritance.animal;

public class Bird extends Animal {
	
	public Bird(String name, int age) {
		super(name, age);
	}
	
	@Override
	protected void makeSound() {
		System.out.println("Bird sound");
	}
}