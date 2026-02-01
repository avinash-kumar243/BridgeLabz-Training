package com.regex.validateipaddress;

import java.util.Scanner;

public class IPAddressValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input text: "); 
		String ip = sc.nextLine();
		
		// Validation of an IP Address
		String regex = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";
		
		boolean isValid = ip.matches(regex);
		
		if(isValid) {
			System.out.println(ip + " is a valid IP Address");
		} else {
			System.out.println(ip + " is an invalid IP Address");
		}
				
		sc.close();
	}
}