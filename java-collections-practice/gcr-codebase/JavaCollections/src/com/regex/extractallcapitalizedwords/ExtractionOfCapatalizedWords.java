package com.regex.extractallcapitalizedwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractionOfCapatalizedWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: "); 
		String text = sc.nextLine();
		
		// Extraction of all capatalized words from text
		String regex = "\\b[A-Z]+[a-z]+\\b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
//		Extraction ex:- Temple, God, Month, Day, USA, Word
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		sc.close();
	}
}