package com.multithreading.problems.downloadmanager;

public class FileDownloader {
	
	// Implements downloading logic
	public void fileDownloading(String file) {
		for(int i=0; i<=100; i+=10) {
			System.out.println(Thread.currentThread().getName() + " -> Downloaded " + i + "%");
			
			try {
				Thread.sleep(400 + (int)(Math.random() * 1800));
			} catch(InterruptedException e) {
				System.out.println("InterruptedException occurs: " + e.getMessage());
			}
		}
	}
}