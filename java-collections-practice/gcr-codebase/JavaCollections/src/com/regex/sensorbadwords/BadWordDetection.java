package com.regex.sensorbadwords;

public class BadWordDetection {
	public static void main(String[] args) {
		System.out.println("Input text is: "); 
		
		String text = "This is a damn bad example with some stupid words.";
		
		// regex to remove bad words
		String regex = "\\b(damn|stupid|fool|nonsense|idiot|dumb|trash|jerk|hell|crap)\\b";
		
		String result = text.replaceAll(regex, "****");	
		
		System.out.println("Reuslt text is: " + result);		
	}
}