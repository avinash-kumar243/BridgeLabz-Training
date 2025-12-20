// Writing a program to store the digits of the number and find the largest and second largest element
import java.util.*;
public class DigitChallengeTwo {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking a number from user
		System.out.println("Enter a number : ");
		long number = sc.nextLong();
		
		// Taking each digit from a number and storing in the array
		int maxDigit = 10;
		long digits[] = new long[maxDigit];
		int index = 0;
		while(number != 0) {
			long digit = number % 10;
			if(index != maxDigit) digits[index++] = digit;
			else {
				maxDigit *= 2;
				long temp[] = new long[maxDigit];
				for(int i=0; i<digits.length; i++) {
					temp[i] = digits[i];
				}
				digits = temp;
				digits[index++] = digit;
			}
			number /= 10;
		}
		
		// Finding and displaying largest and second Largest digits
		long largest = 0, secondLargest = 0;
		for(long num : digits) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			} else if(num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		System.out.println("Largest digit is : " + largest);
		System.out.println("Second Largest digit is : " + secondLargest);
	}
}