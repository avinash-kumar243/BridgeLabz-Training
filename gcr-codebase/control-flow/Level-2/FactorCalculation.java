// Writing a program to find the factors of a number
import java.util.Scanner;
public class FactorCalculation {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		if(number >= 0) {
			System.out.println("Positive Number");
			
			// Calculating all the factors of a number
			for(int i=1; i<number; i++) {
				if(number % i == 0) System.out.println(i);
			}
		}
	}
}