package com.inheritance.animal;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	protected void makeSound() {
		System.out.println("Bark");
	}
}