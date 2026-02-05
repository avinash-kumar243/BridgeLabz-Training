package com.multithreading.problems.threadstatemonitoringsystem;

public class Main {
	public static void main(String[] args) {
		TaskRunner task1 = new TaskRunner("Task-1");
		TaskRunner task2 = new TaskRunner("Task-2");
		
		
		// NEW state 
		System.out.println(task1.getName() + " -> state: " + task1.getState());
		System.out.println(task2.getName() + " -> state: " + task2.getState());
		
		Thread []task = {task1, task2};
		
		StateMonitor monitor = new StateMonitor(task);
		monitor.start();
		
		task1.start();
		task2.start();
	}
}