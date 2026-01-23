package com.exceptions;

import java.util.Scanner;

public class ThrowAndThrows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		double amount = sc.nextDouble();
		System.out.println("Enter rate of interest: ");
		double rate = sc.nextDouble();
		System.out.println("Enter time: ");
		double years = sc.nextDouble();
		
		try {
			double interest = calculateInterest(amount, rate, years);
			System.out.println("Interest: " + interest);
		} catch(IllegalArgumentException e) {
			System.out.println("Invalid input: " + e.getMessage());
		}
	}
	
	public static double calculateInterest(double amount, double rate, double years) throws IllegalArgumentException {
		if(amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount and rate must be positive");
		} else { 
			return (amount * rate * years) / 100;
		}
	}
}