package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;

public class FindRotationPoint {
	
	private static int getSmallestIndex(int[] nums) {
		int st = 0, end = nums.length-1;
        while(st <= end) { 
            int mid = (st + end) / 2;

            if(nums[mid] > nums[st] && nums[st] > nums[end]) st = mid + 1;
            else if(nums[mid] == nums[st] &&  nums[st] > nums[end]) st = mid + 1;
            else if(nums[mid] < nums[st] && nums[mid] < nums[end]) end = mid;
            else end = mid - 1;
        }
        return st;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		sc.nextLine();

		int arr[] = new int[size];
		
		int idx = 0;
		System.out.println("Enter rotated sorted array of size " + size + " : ");
		while(idx < arr.length) {
			arr[idx] = sc.nextInt();
			idx++;
		}
				
		int smallestIdx = getSmallestIndex(arr);
		System.out.println("Smallest Element is: " + arr[smallestIdx]);
		System.out.println("Smallest Element index is: " + smallestIdx);
	}
}