package com.exceptions;

public class ExceptionPropagation {
	public static void main(String[] args) {
		try {
			divisior2(10, 0);
			System.out.println("Method executed successfully");
		} catch(ArithmeticException e) {
			System.out.println("Handled exception in main");
		}
	}

	private static void divisior2(int num1, int num2) {
		divisior1(num1, num2);
	}

	private static void divisior1(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("ArithmeticException occurs:");
		} else {
			int result = num1 / num2;
			System.out.println("Divison successful: " + result);
		}
	}
}