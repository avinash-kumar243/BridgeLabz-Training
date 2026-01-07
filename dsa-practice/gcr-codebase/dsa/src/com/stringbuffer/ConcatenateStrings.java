package com.stringbuffer;

import java.util.Scanner;
public class ConcatenateStrings {
	public static String concatenaString(String words[]) { 
		StringBuffer sb = new StringBuffer();
		
		for(String word : words) {
			sb.append(word);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of string array: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String words[] = new String[size];
		
		System.out.println("Enter " + size + " strings: ");
		for(int i=0; i<size; i++) {
			words[i] = sc.nextLine();
		}
 				
		String result = concatenaString(words);
		System.out.println("Concatenated String is: " + result);
	}
}