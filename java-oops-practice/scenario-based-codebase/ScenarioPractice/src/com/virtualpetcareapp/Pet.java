package com.virtualpetcareapp;

import java.util.Random;

public abstract class Pet implements IInteractable {
	protected String name;
	protected String type;
	private int age;
	
	private int energy;
	private int hunger;
	private int moodStatus;
	
	private static final Random random = new Random();
	
	// Default Values
	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = random.nextInt(10) + 1;
		this.energy = random.nextInt(50) + 50;
		this.hunger = random.nextInt(50) + 50;
		this.moodStatus = random.nextInt(50) + 50;
	}
	// Custom values
	public Pet(String name, String type, int age, int hunger, int energy, int moodStatus) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.energy = energy;
		this.hunger = hunger;
		this.moodStatus = moodStatus;
	}
	
	
	public void updateEnergy(int value) {
		energy += value;
	}
	public void updateMoodStatus(int value) {
		moodStatus += value;
	}
	public void updateHunger(int value) {
		hunger += value;
	}
	
	public void displayDetails() {
		System.out.println("\nStatus of " + name + " (" + type + "): ");
		System.out.println("Age: " + age);
		System.out.println("Hunger level: " + hunger);
		System.out.println("Energy level: " + energy);
		System.out.println("Mood Status: " + moodStatus + "\n");
	}

	public abstract void makeSound();
}