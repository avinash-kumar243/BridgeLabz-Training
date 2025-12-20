// Writing a program to take a number as input and reverse the number
import java.util.*;
public class ReverseNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking a number from user
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// finding the size of the array
		int count = 0, originalNumber = number;
		while(number != 0) {
			int digit = number % 10;
			count++;
			number /= 10;
		}
		
		// findind and storing all the digits of a number in an array
		int arr[] = new int[count];
		int idx = 0;
		while(originalNumber != 0) {
			int digit = originalNumber % 10;
			arr[idx++] = digit;
			originalNumber /= 10;
		}
		
		// Displaying all the digits of a number in reverse order
		System.out.println("The digits of a number in reverse order are : ");
		for(int num : arr) {
			System.out.println(num);
		}
	}
}