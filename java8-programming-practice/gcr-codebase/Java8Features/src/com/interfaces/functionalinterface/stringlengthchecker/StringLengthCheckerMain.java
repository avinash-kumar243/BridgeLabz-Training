package com.interfaces.functionalinterface.stringlengthchecker;

import java.util.List;
import java.util.function.Function;

public class StringLengthCheckerMain {
	public static void main(String[] args) {
		List<String> strings = List.of("I'm good", "Love to play cricket", "Happy New Year");
		
		int maxLength = 15;
		
		Function<String, Integer> f = str -> str.length();
		
		strings.stream()
			   .filter(string -> f.apply(string) > maxLength)
			   .forEach(msg -> System.out.println("(" + f.apply(msg) + " chars): " + msg));
	}
}