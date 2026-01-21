package com.interfaces.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyFinder {

	private static Map<String, Integer> wordCounter(List<String> words) {
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1); 
		}
		return map;
	}

	
	// Main method
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		
		words.add("Mango");
		words.add("Apple");
		words.add("Coconut");
		words.add("Blackberry");
		words.add("Apple");
		words.addFirst("Date");
		words.addLast("Mango");
			
		Map<String, Integer> wordCounter = wordCounter(words);
				
		System.out.println("Each word and their frequency in the list\n");
		
		System.out.println(wordCounter);
	}
}