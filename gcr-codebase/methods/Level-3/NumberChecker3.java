// Writing a program to Create a NumberChecker utility class and perform given tasks
import java.util.*;
public class NumberChecker3 {
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
	
	// Method to reverse digits array
	public static int[] reverse(int digits[]) {
		int st = 0, end = digits.length - 1;
		while(st < end) {
			int temp = digits[st];
			digits[st] = digits[end];
			digits[end] = temp;
			st++;
			end--;
		}
		return digits;
	}
	
	// Method to Check if a number is a Palindrome number or not
	public static boolean isPalindrome(int digits[]) {
		int st = 0, end = digits.length - 1;
		while(st < end) {
			if(digits[st] != digits[end]) return false;
			st++;
			end--;
		}
		return true;
	}
	
	// Method to Check if a number is a duck number using the digits array
	public static boolean duckChecker(int number[]) {
		for(int digit : number) {
			if(digit != 0) return true;
		}
		return false;
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		
		
		// Calling the methods for getting the result
		int size = countDigit(number);
		int digits[] = storeDigit(number, size);
		int reversed[] = reverse(digits);
		boolean isPalindrome = isPalindrome(digits);
		boolean isDucker = duckChecker(digits);
		
		// Displaying all the results
		System.out.println("Number is : " + number);
		
		System.out.println("Digits are : ");
		for(int digit : digits) System.out.println(digit);
		
		System.out.println("Is Palindrome Number : " + isPalindrome);
		System.out.println("Is Ducker : " + isDucker);
		
		System.out.println("The reversed digits are : ");
		for(int i=0; i<reversed.length; i++) {
			System.out.println(reversed[i]);
		}
	}
}