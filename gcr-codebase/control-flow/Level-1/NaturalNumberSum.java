// Writing a program to find the sum of n natural numbers by while loop and formula, and compare them
import java.util.Scanner;
public class NaturalNumberSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			int sumUsingFormula = (number * (number + 1)) / 2;
			
			int sumUsingWhile = 0;
			while(number >= 0) {
				sumUsingWhile += number;
				number--;
			}
			if(sumUsingFormula == sumUsingWhile) System.out.println("both computations is correct - sum is " + sumUsingFormula);
		}
	}
}