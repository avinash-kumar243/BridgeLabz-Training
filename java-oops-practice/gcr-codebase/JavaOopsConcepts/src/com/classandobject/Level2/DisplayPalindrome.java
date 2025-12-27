package com.classandobject.Level2;

public class DisplayPalindrome {
	public static void main(String[] args) {
		PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
		checker1.displayResult();
		
		PalindromeChecker checker2 = new PalindromeChecker("Hello");
		checker2.displayResult();
	}
}