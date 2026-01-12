package com.timeandspacecomplexity;

import java.util.Scanner;

public class FibonaccciComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		long fibonacciItrStartTime = System.nanoTime();
		int result1 = fibonacciIter(num);
		long fibonacciItrEndTime = System.nanoTime();
		System.out.println("Fibonacci calculation time taken : " + (fibonacciItrEndTime - fibonacciItrStartTime));
		
		long fibonacciRecStartTime = System.nanoTime();
		int result2 = fibonacciRec(num);
		long fibonacciRecEndTime = System.nanoTime();
		System.out.println("\nFibonacci calculation time taken : " + (fibonacciRecEndTime - fibonacciRecStartTime));
	}

	private static int fibonacciRec(int n) {
		if(n == 0 || n == 1) return n;
		return fibonacciRec(n-1) + fibonacciRec(n-2);
	}

	private static int fibonacciIter(int n) {
		if(n == 0 || n == 1) return n;
	
		int a = 0, b = 1, ans = 0; 
		for(int i=2; i<=n; i++) {
			ans = a + b;
			a = b;
			b = ans;
		}
		return ans; 
	}
	
}
