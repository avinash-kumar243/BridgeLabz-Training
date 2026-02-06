package com.multithreading.practice.example1;

public class NumberData {
	public void printNumbers() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
} 