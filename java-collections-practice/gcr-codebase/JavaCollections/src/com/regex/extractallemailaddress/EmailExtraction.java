package com.regex.extractallemailaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String text = sc.nextLine();
		
		
		// Extraction regex 
		String regex = "[\\w.-]+@[\\w.-]+\\.\\w{2,}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		// Extraction
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		sc.close();
	}
}