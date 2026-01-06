package com.virtualpetcareapp;

public class Bird extends Pet {

	public Bird(String name) {
		super(name, "Bird");
	}
	public Bird(String name, int age, int hunger, int energy, int mood) {
		super(name, "Bird", age, hunger, energy, mood);
	}
	
	
	@Override
	public void feed() {
		updateHunger(-25);
		updateEnergy(8);
		updateMoodStatus(20);
		System.out.println(name + " ate quitely");
	}

	@Override
	public void play() {
		updateEnergy(-10);
		updateHunger(20);
		System.out.println(name + " is flying with friends");
	}

	@Override
	public void sleep() {
		updateEnergy(20);
		updateMoodStatus(10);
		System.out.println(name + " is taking rest");
	}

	@Override
	public void makeSound() {
		System.out.println("Sound: Chirp");
	}
}