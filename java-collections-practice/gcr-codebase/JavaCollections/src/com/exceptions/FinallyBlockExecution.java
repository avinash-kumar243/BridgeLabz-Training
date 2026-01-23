package com.exceptions;

import java.util.Scanner;

public class FinallyBlockExecution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		try {
			int result = division(num1, num2);
			System.out.println("Result: " + result);
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured: " + e.getMessage());
		} finally {
			System.out.println("\nOperation completed");
		}
	}

	private static int division(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException("Divisor must not be zero");
		} else {
			return dividend / divisor;
		} 
	}
}