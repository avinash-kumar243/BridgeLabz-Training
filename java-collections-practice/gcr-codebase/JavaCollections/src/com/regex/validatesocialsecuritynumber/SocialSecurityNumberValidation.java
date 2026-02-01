package com.regex.validatesocialsecuritynumber;

import java.util.Scanner;

public class SocialSecurityNumberValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number (xxx-xx-xxxx) : ");
		String text = sc.nextLine();
		
		// Social security number validation
		String regex = "^\\b\\d{3}-\\d{2}-\\d{4}\\b$";
		
		boolean isValid = text.matches(regex);
		
		if(isValid) {
			System.out.println("Social security number is valid");
		} else {
			System.out.println("Social security number is not valid");
		}
	}
}