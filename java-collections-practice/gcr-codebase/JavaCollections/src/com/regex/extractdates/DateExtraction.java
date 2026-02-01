package com.regex.extractdates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String text = sc.nextLine();
		
		// Date Extraction
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		// Extract date like :- 12/05/2022, 16/01/2024
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
				
		sc.close();
	}
}