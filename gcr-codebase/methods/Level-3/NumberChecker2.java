// Writing a program to Create a NumberChecker utility class and perform given tasks
import java.util.*;
public class NumberChecker2 {
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
	
	// Method to find the sum of the digits of a number
	public static int digitSum(int digits[]) {
		int sum = 0;
		for(int num : digits) {
			sum += num;
		}
		return sum;
	}
	
	// Method to find the sum of Square of the digits of a number
	public static int digitSquareSum(int digits[]) {
		int sumOfSquare = 0;
		for(int num : digits) {
			sumOfSquare += (Math.pow(num, 2));
		}
		return sumOfSquare;
	}
	
	// Method to Check if a number is a harshad number or not
	public static boolean isHarshadNumber(int number) {
		int sum = 0, originalNumber = number;
		while(number != 0) {
			sum = sum + number % 10;
			number /= 10;
		}
		return originalNumber % sum == 0;
	}
	
	// Method to find the frequency of each digit in the number
	public static int[][] digitFrequncy(int number, int size) {
		int freq[][] = new int[10][2];
		
		while(number != 0) {
			int digit = number % 10;
			freq[digit][0] = digit;
			freq[digit][1] = freq[digit][1] + 1;
			number /= 10;
		}
		return freq;
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		
		
		// Calling the methods for getting the result
		int size = countDigit(number);
		int digits[] = storeDigit(number, size);
		boolean isHarshad = isHarshadNumber(number);
		int sum = digitSum(digits);
		int squareSum = digitSquareSum(digits);
		int freq[][] = digitFrequncy(number, size);
		
		
		// Displaying all the results
		System.out.println("Number is : " + number);
		
		System.out.println("Digits are : ");
		for(int digit : digits) System.out.println(digit);
		
		System.out.println("Is Harshad Number : " + isHarshad);
		
		System.out.println("The sum of the digits are : " + sum);
		System.out.println("The sum of square of digits are : " + squareSum);
		
		System.out.println("The frequency of each digits are : ");
		for(int i=0; i<freq.length; i++) {
			System.out.println("For digit " + freq[i][0] + " - frequncy is " + freq[i][1]);
		}
	}
}