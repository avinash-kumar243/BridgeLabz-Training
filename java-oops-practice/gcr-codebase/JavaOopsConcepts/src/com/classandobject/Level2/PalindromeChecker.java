package com.classandobject.Level2;

public class PalindromeChecker {
	String text;
	
	public PalindromeChecker(String text) {
		this.text = text;
	}
	
	public boolean isPalindrome() {
		String newText = text.replaceAll("\\s", "").toLowerCase();
		String reverseText = new StringBuilder(newText).reverse().toString();
		return newText.equals(reverseText);
	}
	
	public void displayResult() {
		if(isPalindrome()) System.out.println(text + " is Plaindrome");
		else System.out.println(text + " is not palindrome");
	}
}