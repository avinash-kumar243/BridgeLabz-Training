package com.regex.ExtractLinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtraction {
	public static void main(String[] args) {
		System.out.println("Input text is: "); 
		
		String text = "Visit https://www.google.com and http://example.org for more info.";
		
		// Extraction of links from Web Page
		String regex = "https?://[A-Za-z0-9._]+\\.[A-Za-z]{2,}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		// Extracting links ex:- https://www.google.com, http://example.org
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}