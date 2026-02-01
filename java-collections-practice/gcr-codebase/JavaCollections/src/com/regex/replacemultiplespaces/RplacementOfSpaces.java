package com.regex.replacemultiplespaces;

import java.util.Scanner;

public class RplacementOfSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String text = sc.nextLine();
		
		// Replacement of multiple spaces with a single space
		String regex = "\\s+";
		String result = text.replaceAll(regex, " ");
		
		System.out.println("Result text is: " + result);
		
		sc.close();
	}
}