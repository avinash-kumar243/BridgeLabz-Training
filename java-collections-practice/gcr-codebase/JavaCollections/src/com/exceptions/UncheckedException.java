package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter first number: ");
			int dividend = sc.nextInt();
			
			System.out.println("Enter second number: ");
			int divisor = sc.nextInt();
			
			int result = dividend / divisor;
			System.out.println("Result: " + result);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Invalid number: " + e.getMessage());
		}
	}
}