// Writing a program to find the sum of numbers until the user enters zero
import java.util.Scanner;
public class FindSumUntilZero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		System.out.println("Enter a value : ");
		double value = sc.nextDouble();
		
		while(value != 0) {
			total += value;
			value = sc.nextDouble();
		}
		System.out.println("Total value would be " + total);
	}
}