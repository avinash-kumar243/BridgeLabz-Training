// Writing a program to Create a NumberChecker utility class and perform given tasks
import java.util.*;
public class NumberChecker {
	// Method to Find the count of digits in the number
	public static int countDigit(int number) {
		int count = 0;
		while(number != 0) {
			count++;
			number /= 10;
		}
		return count;
	}
	
	// Method to Store the digits of the number in a digits array
	public static int[] storeDigit(int number, int size) {
		int digits[] = new int[size];
		int idx = 0;
		
		while(number != 0) {
			int digit = number % 10;
			digits[idx++] = digit;
			number /= 10;
		}
		return digits;
	}
	
	// Method to Check if a number is a duck number using the digits array
	public static boolean duckChecker(int number[]) {
		for(int digit : number) {
			if(digit != 0) return true;
		}
		return false;
	}
	
	// Method to check if the number is a armstrong number using the digits array
	public static boolean checkArmstrong(int digits[], int number) {
		int sum = 0, power = digits.length;
		for(int num : digits) {
			sum += Math.pow(num, power);
		}
		return sum == number;
	}
	
	// Method to find the largest and second largest elements in the digits array
	public static int[] largestAndSecondLargest(int number[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = max1;
		
		for(int num : number) {
			if(num > max1) {
				max2 = max1;
				max1 = num;
			} else if(num > max2 && num != max1) {
				max2 = num;
			}
		}
		return new int[] {max1, max2};
	}
	
	// Method to find the the smallest and second smallest elements in the digits array
	public static int[] smallestAndSecondSmallest(int number[]) {
		int min1 = Integer.MAX_VALUE;
		int min2 = min1;
		
		for(int num : number) {
			if(num < min1) {
				min2 = min1;
				min1 = num;
			} else if(num < min2 && num != min1) {
				min2 = num;
			}
		}
		return new int[] {min1, min2};
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		
		// Calling the methods for getting the result
		int size = countDigit(number);
		int digits[] = storeDigit(number, size);
		boolean isDucker = duckChecker(digits);
		boolean isArmstrong = checkArmstrong(digits, number);
		int largest[] = largestAndSecondLargest(digits);
		int smallest[] = smallestAndSecondSmallest(digits);
		
		
		// Displaying all the results
		System.out.println("Number is : " + number);
		
		System.out.println("Digits are : ");
		for(int digit : digits) System.out.println(digit);
		
		System.out.println("Is Ducker : " + isDucker);
		
		System.out.println("Is Armstrong : " + isArmstrong);
		
		System.out.println("Largest digit is : " + largest[0] + " and second largest digit is : " + largest[1]);
		System.out.println("Smallest digit is : " + smallest[0] + " and second Smallest digit is : " + smallest[1]);
	}
}