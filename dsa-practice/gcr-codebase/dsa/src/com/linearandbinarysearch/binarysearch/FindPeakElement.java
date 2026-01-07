package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;

public class FindPeakElement {
	public static int findPeakElement(int nums[]) {
		int n = nums.length;
		
		if(n >= 2 && nums[0] > nums[1]) return 0;
		if(n >= 2 && nums[n-1] > nums[n-2]) return n-1;
		
		int st = 0, end = n-1;
        while(st < end) { 
            int mid = (st + end) / 2;

            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid-1]) end = mid - 1;
            else st = mid + 1;
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
		System.out.println("Enter array elements of size " + size + " : ");
		while(idx < arr.length) {
			arr[idx] = sc.nextInt();
			idx++;
		}
		
		int peakElementIdx = findPeakElement(arr);
		System.out.println("Peak Element is: " + arr[peakElementIdx]);
		System.out.println("Peak Element index is: " + peakElementIdx);
	}
}