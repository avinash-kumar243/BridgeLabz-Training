package com.multithreading.practice.example4;

public class Main {
	public static void main(String[] args) {
//		Thread t = new Thread(new MyThread());
		
		Thread t = new Thread(() -> System.out.println("Thread is running"));
		
		
		System.out.println(t.getState());

		t.start();

		System.out.println(t.getState());
	}
}