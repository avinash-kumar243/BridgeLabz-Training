package com.multithreading.practice.example5using_java8;

public class Main {
	public static void main(String[] args) {
		
		// Using Lambda expression to implement Runnable interface
		Thread thread1 = new Thread(() -> {
			for(int i=1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println("IntruptedException occurs: " + e.getMessage());
				}
			}
		});
		
		
		// Using anonymous inner class
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					System.out.println(Thread.currentThread().getName() + " -> " + i);
					
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println("InterruptedException occurs: " + e.getMessage());
					}
				}
			}
		});
		
		
		thread1.start();
		thread2.start();
	}
}