package com.virtualpetcareapp;

public class Dog extends Pet {
	
	public Dog(String name) {
		super(name, "Dog");
	}
	public Dog(String name, String type, int age, int hunger, int energy, int mood) {
		super(name, "Dog", age, hunger, energy, mood);
	}

	
	@Override
	public void feed() {
		updateHunger(-10);
		updateEnergy(10);
		updateMoodStatus(15);
		System.out.println(name + " has enjoyed his meal");
	}

	@Override
	public void play() {
		updateEnergy(-10);
		updateHunger(20);
		System.out.println(name + " is playing");
	}

	@Override
	public void sleep() {
		updateEnergy(15);
		updateMoodStatus(10);
		System.out.println(name + " is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Sound: Bhow Bhow");
	}
}