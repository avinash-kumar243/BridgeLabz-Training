package com.virtualpetcareapp;

public class Cat extends Pet {

	public Cat(String name) {
		super(name, "Cat");
	}
	public Cat(String name, int age, int hunger, int energy, int mood) {
		super(name, "Cat", age, hunger, energy, mood);
	}
	
	
	@Override
	public void feed() {
		updateHunger(-20);
		updateEnergy(15);
		updateMoodStatus(25);
		System.out.println(name + " ate quitely");
	}

	@Override
	public void play() {
		updateEnergy(-15);
		updateHunger(30);
		System.out.println(name + " is chasing a mouse");
	}

	@Override
	public void sleep() {
		updateEnergy(20);
		updateMoodStatus(15);
		System.out.println(name + " is taking rest");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Sound: Meow Meow");
	}
}