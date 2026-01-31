package com.regex.validatelicensenumber;

import java.util.Scanner;

public class LicensePlate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String input = sc.nextLine();
		
		String regex = "^[A-Z]{2}\\d{4}$";
		
		boolean isValid = input.matches(regex);
		
		if(isValid) System.out.println("Valid");
		else System.out.println("Invalid Input!!!"); 
		
		sc.close();
	}
}