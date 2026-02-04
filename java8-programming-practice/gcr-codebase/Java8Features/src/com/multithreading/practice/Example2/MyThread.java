package com.multithreading.practice.Example2;

public class MyThread extends Thread {
	
	// Aggregation
	NumberLogic logic;
	
	public MyThread(NumberLogic logic) {
		this.logic = logic;
	}
	
	@Override
	public void run() {
		logic.printNumbers(); 
	}
}