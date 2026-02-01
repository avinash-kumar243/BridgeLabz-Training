package com.regex.extractcurrencyvalue;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyValueExtractor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text");
		String text = sc.nextLine();
		
		// Extraction of currency values
		String regex = "\\$?\\d+(\\.\\d+)?";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Matched cueency values are: ");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		sc.close();
	}
}