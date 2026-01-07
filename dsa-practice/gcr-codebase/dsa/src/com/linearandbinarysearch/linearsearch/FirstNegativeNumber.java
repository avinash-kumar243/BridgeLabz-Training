package com.linearandbinarysearch.linearsearch;

import java.util.Scanner;

public class FirstNegativeNumber {
	public static int linearSearch(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		sc.nextLine();

		int arr[] = new int[size];
		
		int idx = 0;
		System.out.println("Enter " + size + " elements: ");
		while(idx < arr.length) {
			arr[idx] = sc.nextInt();
			idx++;
		}		
		
		int ansIdx = linearSearch(arr);
		
		if(ansIdx != -1) System.out.println("\nFirst Negative number: " + arr[ansIdx] + " and it is present at index: " + ansIdx);
		else System.out.println("\nNegative number not found");
	}
}