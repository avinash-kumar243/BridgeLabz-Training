package com.junit.testing_exceptionhandling;

public class Main {
	public int divide(int a, int b) {
		
		if(b == 0) {
			throw new ArithmeticException("Number can't be divisible by zero");
		}
		return a / b; 
	}
}