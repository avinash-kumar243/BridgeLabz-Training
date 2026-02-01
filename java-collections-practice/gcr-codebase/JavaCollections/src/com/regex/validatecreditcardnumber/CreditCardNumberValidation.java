package com.regex.validatecreditcardnumber;

import java.util.Scanner;

public class CreditCardNumberValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a card number: "); 
		String cardNumber = sc.nextLine();
		
		// Visa Validation
		String visaRegex = "^4\\d{15}$";
		boolean isVisaValid = cardNumber.matches(visaRegex);
		
		// Master Card Validation
		String masterCardRegex = "^5\\d{15}$";
		boolean isMasterCardValid = cardNumber.matches(masterCardRegex);
		
		if(isVisaValid) System.out.println("Valid Visa Number");
		else if(isMasterCardValid) System.out.println("Valid Master Card");
		else System.out.println("Neither Visa nor Master Card valid number!!!");	
		
		sc.close();
	}
}