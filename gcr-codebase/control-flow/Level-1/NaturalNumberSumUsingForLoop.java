// Writing a program to find the sum of n natural numbers by For loop and formula, and compare them
import java.util.Scanner;
public class NaturalNumberSumUsingForLoop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			int sumUsingFormula = (number * (number + 1)) / 2;
			
			int sumUsingFor = 0;
			for(int num = number; num >= 0; num--) {
				sumUsingFor += num;
			}
			if(sumUsingFormula == sumUsingFor) System.out.println("both computations is correct - sum is " + sumUsingFormula);
		}
	}
}