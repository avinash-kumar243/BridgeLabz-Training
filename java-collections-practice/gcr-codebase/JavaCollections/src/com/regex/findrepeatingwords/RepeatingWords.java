package com.regex.findrepeatingwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatingWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text");
		String text = sc.nextLine();
		
		// Finding repeating words form a test
		String regex = "\\b(\\w+)\\s+\\1\\b";
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		
		
		System.out.println("\nRepeated words are :- ");
		while(matcher.find()) {
			System.out.println(matcher.group(1));
		}
		
		sc.close();
	}
}