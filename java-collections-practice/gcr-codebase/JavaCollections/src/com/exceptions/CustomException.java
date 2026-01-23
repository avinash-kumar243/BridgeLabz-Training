package com.exceptions;

import java.util.Scanner;


// Custom Exception class
class InvalidAgeException extends ArithmeticException {
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			validateAge(age);
		} catch(InvalidAgeException e) {
			System.out.println("Invalid age excption occurs: " + e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18 && age > 0) {
			throw new InvalidAgeException("Age below 18 can't vote");
		} else if(age <= 0) {
			throw new InvalidAgeException("Age must be positive");
		} else {
			System.out.println("Access grantes! You can vote");
		}
	}
}