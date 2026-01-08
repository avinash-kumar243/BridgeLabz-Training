package com.linearandbinarysearch.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeProblem {
	private static int findMissingNumber(int[] arr) {
		int temp[] = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			temp[arr[i] - 1] = -1; 
		}
		for(int i=0; i<temp.length; i++) {
			if(temp[i] != -1) return i + 1;
		}
		return 0;
	}
	
	private static int findTargetIndex(int[] nums, int target) {
		int low = 0, high = nums.length-1;
	    
	    while(low <= high) {
	    		int mid = low + (high - low) / 2;
	    		
	    		if(nums[mid] == target) return mid;
	    		if(nums[mid] < target) low = mid+1;
	    		else high = mid-1;
	    }
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		sc.nextLine();

		int arr[] = new int[size];
		
		int idx = 0;
		System.out.println("Enter " + size + " different elements between 1 and " + (size+1) + " : ");
		while(idx < arr.length) {
			arr[idx] = sc.nextInt();
			idx++;
		}
		
		// Finding missing number
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number is: " + missingNumber);
		
		// Finding occurrence of a number
		Arrays.sort(arr);
		System.out.print("Enter a number to find occurence : ");
		int target = sc.nextInt();
				
		int targetIndex = findTargetIndex(arr, target);
		
		if(targetIndex != -1) System.out.println("After sorting the array, target number found at index: " + targetIndex);
		else System.out.println("Target number not found!!!");
	}
}