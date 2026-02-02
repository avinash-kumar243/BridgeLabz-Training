package com.questions.functionalinterface.function.student;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) {
		
		// Convert student marks into grade (A/B/C) using Function
		System.out.println("------------- Converting student marks into grade (A/B/C) using Function --------------\n");
		
		Function<Integer, Character> gradeCalculator = marks -> {
			if(marks >= 75) return 'A';
			else if(marks >= 60) return 'B';
			else if(marks >= 45) return 'C';
			else return 'F';
		};
		
		System.out.println("Marks: 85, grade: " + gradeCalculator.apply(85));
		System.out.println("Marks: 64, grade: " + gradeCalculator.apply(64));
		System.out.println("Marks: 42, grade: " + gradeCalculator.apply(42));
	}
}