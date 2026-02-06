package com.multithreading.practice.example2;

public class NumberLogic {
	public void printNumbers() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " -> Num is: " + i);
			
			try {	
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("InterruptedException occurs: " + e.getMessage());
			}
		}
	}
}