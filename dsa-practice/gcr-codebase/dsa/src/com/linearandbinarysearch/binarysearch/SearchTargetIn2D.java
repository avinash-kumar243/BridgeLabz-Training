package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;
public class SearchTargetIn2D {
	private static boolean SearchTarget(int[][] nums, int target) {
		int rows = nums.length;
		int cols = nums[0].length;
		int low = 0, high = rows*cols - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			int row = mid / cols;
			int col = mid % cols;
			int value = nums[row][col];
			
			if(nums[row][col] == target) return true;
			else if(nums[row][col] < target) low = mid+1;
			else high = mid-1;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[][] = {{2, 5, 6, 8, 10},
						{15, 16, 18, 22, 25},
						{38, 42, 45, 60, 62}};
		
		System.out.print("Enter a number to search: ");
		int target = sc.nextInt();
		
		boolean isFound = SearchTarget(nums, target);
		
		if(isFound) System.out.println("Target is found in the matrix");
		else System.out.println("Target not found");
	}
}