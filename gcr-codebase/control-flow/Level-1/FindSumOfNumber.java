// Writing a program to find the sum of numbers until the user enters zero negative number
import java.util.Scanner;
public class FindSumOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		System.out.println("Enter a value : ");
		double value = sc.nextDouble();
		
		while(true) {
			total += value;
			value = sc.nextDouble();
			if(value <= 0) break;
		}
		System.out.println("Total value would be " + total);
	}
}