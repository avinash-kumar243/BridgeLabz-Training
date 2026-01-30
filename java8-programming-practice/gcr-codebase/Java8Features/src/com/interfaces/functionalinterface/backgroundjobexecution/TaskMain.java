package com.interfaces.functionalinterface.backgroundjobexecution;

public class TaskMain {
	public static void main(String[] args) {
		// Runnable Functional Interface -> defines a task that can be executed by a thread.
		Runnable task = () -> System.out.println("Task is running using lambda");
		
		Thread t = new Thread(task);
		t.start();
	}
}