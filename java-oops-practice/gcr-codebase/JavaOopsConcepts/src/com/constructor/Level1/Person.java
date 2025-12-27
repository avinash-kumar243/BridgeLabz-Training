package com.constructor.Level1;

public class Person {
	public static void main(String[] args) {
		DisplayPerson person1 = new DisplayPerson("Deepak", 24, 50000);
		DisplayPerson person2 = new DisplayPerson(person1);
		
		person2.displayPersonDetails();
	}
}