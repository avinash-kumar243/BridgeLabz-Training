package com.multithreading.practice.Example3usingrunnable;

public class PrintNumbers {
	public void printNumbers() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " -> num: " + i); 
			
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("InterruptedException occurs: " + e.getMessage()); 
			}
		}
	}
}