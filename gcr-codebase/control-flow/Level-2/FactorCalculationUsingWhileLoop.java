// Writing a program to find the factors of a number using while loop
import java.util.Scanner;
public class FactorCalculationUsingWhileLoop {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		if(number >= 0) {
			System.out.println("Positive Number");
			
			// Calculating all the factors of a number
			int counter = 1;
			while(counter < number) {
				if(number % counter == 0) System.out.println(counter);
				counter++;
			}
		}
	}
}