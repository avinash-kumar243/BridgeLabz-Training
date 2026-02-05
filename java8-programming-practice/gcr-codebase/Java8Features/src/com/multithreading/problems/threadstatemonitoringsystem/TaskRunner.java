package com.multithreading.problems.threadstatemonitoringsystem;


public class TaskRunner extends Thread {
	
	TaskRunner(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		// RUNNABLE
		for(int i=0; i<1000000; i++) {
			int x = i + i; 
		}
		
		
		// TIME-WAITING
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// TERMINATED (final computation -> then terminated)
		for(int i=0; i<1000; i++) {
			int y = i + i;
		}
	}
}
