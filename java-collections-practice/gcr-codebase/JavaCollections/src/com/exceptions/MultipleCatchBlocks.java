package com.exceptions;

import java.util.Scanner;

public class MultipleCatchBlocks {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		int nums[] = null;
		
		System.out.println("Do you want to create array, if yes press 1 else 0");
		int choice = sc.nextInt();
		
		if(choice == 1) nums = createArray(nums);
		
		System.out.println("Enter index: ");
		int index = sc.nextInt();
		
		
		try {
			System.out.println("Value at index " + index + ": " + nums[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs: " + e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		}
	}

	private static int[] createArray(int[] nums) {
		System.out.println("Enter size: ");
		int size = sc.nextInt();

		nums = new int[size];			
		System.out.println("Enter elements: ");
		for(int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		return nums;
	}
}