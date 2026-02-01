package com.questions.lambdaexpression.basicsystem;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		
		// Task 1 :- Use lambda to run a task in a separate thread.
		System.out.println("\n1. -------------- Using lambda to run a task in a separate thread --------------");
		Runnable task = () -> {
			System.out.println("\n1. Task is running in thread: " + Thread.currentThread().getName());
		};
		
		Thread t = new Thread(task);
		t.start();
		
		
		
		// Task 2 :- Use lambda to print numbers from a list.
		System.out.println("\n2. ------------- Numbers from a lsit -------------");
		
		List<Integer> numbers = List.of(10, 20, 40, 36, 54, 25, 67, 90, 85);
		numbers.forEach(n -> System.out.println(n));
		
		
		
		// Task 3 :- Use lambda to check if a number is even or odd.
		System.out.println("\n3. ------------ Using lambda to check if a number is even or odd -------------");
		
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println("Is even: " + isEven.test(10));
		System.out.println("Is even: " + isEven.test(11));
		
		
		
		// Task 4 :- Use lambda to add two numbers.
		System.out.println("\n4. ------------- Using lambda to add two numbers --------------");
		BiFunction<Integer, Integer, Integer> bs = (a, b) -> a + b; 
		
		System.out.println("Sum: " + bs.apply(10, 20));
		
		
		
		// Task 5 :- Use lambda to find greater of two numbers.
		System.out.println("\n5. -------------- Using lambda to find greater of two numbers --------------");
		
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a > b ? a : b;
		System.out.println("Greater: " + bf.apply(10,  20)); 
	}
}