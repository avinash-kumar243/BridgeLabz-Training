package com.virtualpetcareapp;

public class Main {
	public static void main(String[] args) {
		Pet pet = new Dog("Sheru");
		
		pet.makeSound();
		pet.displayDetails();
		
		pet.feed();
		pet.sleep();
		pet.play();
		
		pet.displayDetails();
	}
}