package com.linearandbinarysearch.linearsearch;

public class FirstNegativeNumber {
	public static int linearSearch(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {14, 5, 20, 25, 16, 18, 30, 15};
		
		int idx = linearSearch(arr);
		
		if(idx != -1) System.out.println("First Negative number: " + arr[idx] + " and it is present at index: " + idx);
		else System.out.println("Negative number not found");
	}
}