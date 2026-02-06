package com.multithreading.practice.example2;

public class Main {
	public static void main(String[] args) {
		NumberLogic logic1 = new NumberLogic();
		
		MyThread t1 = new MyThread(logic1);
		MyThread t2 = new MyThread(logic1);
		
		t1.setName("Thread 0");
		t2.setName("Thread 1");
		
		t1.start();
		t2.start();
	}
}	