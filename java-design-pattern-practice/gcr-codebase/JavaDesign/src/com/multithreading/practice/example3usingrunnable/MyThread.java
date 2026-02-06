package com.multithreading.practice.example3usingrunnable;

public class MyThread implements Runnable {
	
	// Aggregation
	PrintNumbers printNum;
	
	public MyThread(PrintNumbers printNum) {
		this.printNum = printNum;
	}
	
	@Override
	public void run() {
		printNum.printNumbers();
	}
}