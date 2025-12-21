// Writing a program to find the sum of n natural numbers using loop
import java.util.Scanner;
public class NaturalNumberSum {
	// Calculating the sum of n natural numbers using loop
	public int naturalNumberSum(int number) {
		int sum = 0;
		while(number != 0) {
			sum += number;
			number--;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of a number
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		NaturalNumberSum obj = new NaturalNumberSum();
		int sum = obj.naturalNumberSum(number);
		
		// Displaying the sum of n natural number
		System.out.println("Sum of " + number + " natural number is : " + sum);
	}
}