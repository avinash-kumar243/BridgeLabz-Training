package com.collectors.wordfrequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String paragraph = "I am good. I am a boy. You are a girl" ;
		
		String words[] = paragraph.toLowerCase().replace(".", "").split("\\s+");
		 
		Map<String, Integer> result = Arrays.stream(words)
				.collect(Collectors.toMap(
						word -> word, 
						word -> 1,
						Integer::sum
				));
		
		
		for(Map.Entry<String, Integer> emt : result.entrySet()) {
			System.out.println(emt.getKey() + " -> " + emt.getValue());
		}
	}
} 