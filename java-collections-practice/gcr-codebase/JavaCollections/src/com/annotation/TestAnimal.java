package com.annotation;

class Animal {
	public void makeSound() {
	    System.out.println("Some generic animal sound");
	}
}

class Dog extends Animal {
 @Override
	public void makeSound() {
	    System.out.println("Woof! Woof!");
	}
}

public class TestAnimal {
	public static void main(String[] args) {
	    Dog dog = new Dog();  // instantiate Dog
	    dog.makeSound();      // call overridden method
	}
}
