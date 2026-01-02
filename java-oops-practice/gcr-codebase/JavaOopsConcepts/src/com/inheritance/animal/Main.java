package com.inheritance.animal;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Animal("Bruno", 3);
		Animal a2 = new Animal("Kitty", 2);
		Animal a3 = new Animal("Rio", 1);
		
		a1.showInfo();
		a1.makeSound();
		
		a2.showInfo();
		a2.makeSound();
		
		a3.showInfo();
		a3.makeSound();
	}
}