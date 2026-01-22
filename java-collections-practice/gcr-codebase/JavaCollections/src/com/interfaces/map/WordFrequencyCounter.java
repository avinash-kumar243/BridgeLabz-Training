package com.interfaces.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String str = sc.nextLine();
		
		String words[] = str.split(" ");
		
		Map<String, Integer> map = frequencyCounter(words);
		
		// Displaying each word with their frequency
		for(Entry<String, Integer> emt : map.entrySet()) {
			System.out.println(emt.getKey() + " = " + emt.getValue());
		}
	}

	private static HashMap<String, Integer> frequencyCounter(String[] words) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			word = word.toLowerCase();
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		return map;
	}
}