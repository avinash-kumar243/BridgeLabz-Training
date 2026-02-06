package com.multithreading.practice.example1;

public class MyThread extends Thread {
	
	// Aggregation
	NumberData data;
	
	public MyThread(NumberData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		data.printNumbers();
	}
}