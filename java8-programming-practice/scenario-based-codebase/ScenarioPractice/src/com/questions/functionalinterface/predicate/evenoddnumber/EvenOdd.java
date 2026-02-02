package com.questions.functionalinterface.predicate.evenoddnumber;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		// Predicate to check if number is even or odd.
		Predicate<Integer> p = number -> number % 2 == 0;
		
		// Displaying a number status
		if(p.test(num)) System.out.println(num + " is even");
		else System.out.println(num + " is odd");
	}
}