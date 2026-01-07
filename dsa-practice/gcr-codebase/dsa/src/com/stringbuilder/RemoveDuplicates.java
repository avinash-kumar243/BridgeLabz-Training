package com.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String ansString = removeDuplicates(str);
		
		System.out.println("Original string is: " + str);
		System.out.println("Resultant string is: " + ansString);
	}

	private static String removeDuplicates(String str) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}