package com.linearandbinarysearch.linearsearch;

import java.util.Scanner;
public class FindSpecificWord {
	public static String searchWord(String words[], String word) {
		for(String sentence : words) {
			if(sentence.contains(word)) return sentence;
		}
		return "Not Found";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of sentences: ");
		int size = sc.nextInt();
		sc.nextLine();

		String words[] = new String[size];
		System.out.println("\nEnter " + size + " sentences: ");
		int idx = 0;
		while(idx < size) {
			words[idx] = sc.nextLine();
			idx++;
		}
		
		System.out.print("\nEnter a word to search: ");
		String word = sc.nextLine();
		
		String result = searchWord(words, word);
		if(result.equalsIgnoreCase("Not Found")) System.out.println(result);
		else System.out.println("\"" + word + "\"" + " word found in this sentence -> " + result);
	}
}