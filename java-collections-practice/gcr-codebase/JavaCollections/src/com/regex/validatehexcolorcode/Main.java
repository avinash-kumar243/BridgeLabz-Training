package com.regex.validatehexcolorcode;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String input = sc.nextLine();

		String regex = "^[#][0-9A-Fa-f]{6}$";
		
		boolean isHexColor = input.matches(regex);
		
		if(isHexColor) {
			System.out.println("Valid Hex Color");
		} else {
			System.out.println("Invalid Hex Color!!!"); 
		}
		
		sc.close();
	}
}