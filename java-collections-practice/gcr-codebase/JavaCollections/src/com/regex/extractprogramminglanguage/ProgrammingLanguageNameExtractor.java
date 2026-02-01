package com.regex.extractprogramminglanguage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageNameExtractor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text: "); 
		String text = sc.nextLine();
		
		// Extraction of Programming language names
		String regex = "Python|JavaScript|Java|Go|Net";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("\n--------------- Extracted Programming Languages -----------------");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		sc.close();
	}
}