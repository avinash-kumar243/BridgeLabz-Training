package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;

public class FirstAndLastOccurance {
	// Finding first occurrence of target
	private static int firstOccurance(int[] nums, int target) {
		int low = 0, high = nums.length-1;
		    
	    while(low <= high) {
	    		int mid = low + (high - low) / 2;
	    		
	    		if(nums[mid] >= target) high = mid-1;
	    		else low = mid+1;
	    }
		return low;
	}
	
	// Finding last occurrence of target
	private static int lastOccurance(int[] nums, int target) {
	    int low = 0, high = nums.length-1;
	    
	    while(low <= high) {
	    		int mid = low + (high - low) / 2;
	    		
	    		if(nums[mid] <= target) low = mid+1;
	    		else high = mid-1;
	    }
		return high;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		sc.nextLine();

		int arr[] = new int[size];
		
		// Taking user input for the elements of the array
		int idx = 0;
		System.out.println("Enter array elements of size " + size + " : ");
		while(idx < arr.length) {
			arr[idx] = sc.nextInt();
			idx++;
		}
				
		System.out.print("Enter a number to find first and last occurnace in the array: ");
		int target = sc.nextInt();
		
		int first = firstOccurance(arr, target);
		int last = lastOccurance(arr, target);
		
		// If number not found then print message, else return first and last occurrence
		if(first > last) System.out.println("Number not found!!!");
		else System.out.println("First occurance: " + first + " and last occurance: " + last);
	}
}