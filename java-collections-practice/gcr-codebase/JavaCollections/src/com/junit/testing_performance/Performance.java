package com.junit.testing_performance;

public class Performance {
	
	public void longRunningTask() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Task completed");
	}
}