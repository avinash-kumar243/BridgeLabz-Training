package com.linearandbinarysearch.linearsearch;

public class FindSpecificWord {
	public static String searchWord(String words[], String word) {
		for(String sentence : words) {
			if(sentence.contains(word)) return sentence;
		}
		return "Not Found";
	}
	public static void main(String[] args) {
		String words[] = {"I am Avi", "I love music", "Akshay Love Coding", "Play cricket in free time"};
		String word = "Love";
		
		String result = searchWord(words, word);
		if(result.equalsIgnoreCase("Not Found")) System.out.println(result);
		else System.out.println("\"" + word + "\"" + " word found in this sentence -> " + result);
	}
}