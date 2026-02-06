package com.multithreading.practice.example3usingrunnable;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(new PrintNumbers()));
		
		t1.setName("My Thread"); 
		t1.start();
	}
} 