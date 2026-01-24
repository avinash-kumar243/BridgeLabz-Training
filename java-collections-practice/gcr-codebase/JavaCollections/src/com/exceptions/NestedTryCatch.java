package com.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// outer try to validate - index out of bound exception
		try {
			int nums[] = {10, 20, 30, 40, 50};
			System.out.println(Arrays.toString(nums));
			
			System.out.println("\nEnter index to search: ");
			int index = sc.nextInt();
			
			int data = nums[index];
			
			// inner try to validate - arithmetic exception
			try {
				System.out.println("Enter divisor: ");
				int divisor = sc.nextInt();
				
				int result = data / divisor;
				System.out.println("Division Result is: " + result);
			} catch(ArithmeticException e) {
				System.out.println("Cannot divide by zero!");
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index!");
		}
	}
}