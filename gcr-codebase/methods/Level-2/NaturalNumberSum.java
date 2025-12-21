// Writing a program to find the sum of n natural numbers using recursion and formula, and compare them
import java.util.Scanner;
public class NaturalNumberSum {
	// Calculating natural number sum of a number by recursion
	public static int recursiveSum(int number) {
		if(number == 1) return 1;
		return number + recursiveSum(number - 1);		
	}
	
	// Calculating natural number sum of a number by formula
	public static int formulaSum(int number) {
		return (number * (number + 1)) / 2;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking a number from user
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// If number is negative or zero then program terminated
		if(number <= 0) {
			System.err.println("Invalid Number");
			System.exit(0);
		}
		
		// Calculating sum and doing comparision
		int recursiveSum = recursiveSum(number);
		int formulaSum = formulaSum(number);
		
		if(recursiveSum == formulaSum) System.out.println("both computations are correct - sum is " + recursiveSum);
	}
}