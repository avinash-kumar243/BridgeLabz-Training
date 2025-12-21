// Writing a program to display whether a number is positive,  negative, or zero
import java.util.Scanner;
public class DisplayNumber {
	// A method that will check if a number is either positive or negative
	public static boolean isPositive(int number) {
		if(number >= 0) return true;
		else return false;
	}
	
	// A method that will check if a number is either even or odd
	public static boolean isEven(int number) {
		if(number % 2 == 0) return true;
		else return false;
	}
	
	// A method that will compare first and last number and tell which one is greater
	public static int compare(int num1, int num2) {
		if(num1 > num2) return 1;
		else if(num1 < num2) return -1;
		else return 0;
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking 5 numbers as input
		int nums[] = new int[5];
		System.out.print("Enter 5 numbers : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		// Check the status of every number from array
		for(int i=0; i<nums.length; i++) {
			if(isPositive(nums[i])) {
				if(isEven(nums[i])) System.out.println(nums[i] + " is Even and Positive"); 
				else System.out.println(nums[i] + " is Odd and Positive");
			} else if (nums[i] < 0) System.out.println(nums[i] + " is a Negative Number");
			else System.out.println(nums[i] + " is Zero");
		}
		
		// Displaying the result
		if(compare(nums[0], nums[4]) == 1) System.out.println("First number is greater than last number");
		else if(compare(nums[0], nums[4]) == -1) System.out.println("First number is smaller than last number");
		else System.out.println("Both numbers are equal");
	}
}	