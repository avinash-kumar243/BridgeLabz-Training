package com.junit.testing_string_utility_methods;

public class StringUtils {
	
	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = reverseString(str);
		
		return str.equalsIgnoreCase(rev); 
	}
	
	public String toUpperCase(String str) {
		return str.toUpperCase();
	}
}