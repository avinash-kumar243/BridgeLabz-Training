package com.regex.validateusername;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String input = sc.next();
		
		String regex = "^[A-Za-z]\\w{4,14}$"; 
		
		boolean isValid = input.matches(regex);
		
		if(isValid) System.out.println("Valid");
		else System.out.println("Invalid Input!");
	}
}