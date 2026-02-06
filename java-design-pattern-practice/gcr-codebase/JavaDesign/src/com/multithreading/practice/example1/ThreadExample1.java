package com.multithreading.practice.example1;

public class ThreadExample1 {
	public static void main(String[] args) {
		
		NumberData data = new NumberData();
		
		MyThread number1 = new MyThread(data);
		MyThread number2 = new MyThread(data);
		
		number1.start();
		number2.start();
	}
}