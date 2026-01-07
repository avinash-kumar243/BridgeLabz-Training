package com.stringbuilder;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String reversedStr = reverseString(str);
		System.out.println("Original string is: " + str);
		System.out.println("Reversed string is: " + reversedStr);
	}

	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}