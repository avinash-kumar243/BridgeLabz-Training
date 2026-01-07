package com.stringbuffer;

public class CompareStringbuilderAndStringbuffer {
	public static long concatanationByStringBuilder(String string) {
		StringBuilder sb = new StringBuilder();
		
		long startTime = System.nanoTime(); // Start Time
		
		for(int i=0; i<100000; i++) {
			sb.append(string);
		}
		
		long endTime = System.nanoTime(); // End Time
		long duration = endTime - startTime;
		
		return duration;
	}
	public static long concatanationByStringBuffer(String string) {
		StringBuffer sb = new StringBuffer();
		
		long startTime = System.nanoTime();
		
		for(int i=0; i<100000; i++) {
			sb.append(string);
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime; 
		
		return duration;
	}
	public static void main(String[] args) {
		String string = "Hello";
		
		long duration1 = concatanationByStringBuilder(string);
		long duration2 = concatanationByStringBuffer(string);
		
		System.out.println("Time taken by StringBuilder: " + duration1);
		System.out.println("Time taken by StringBuffer: " + duration2);	
	}
}