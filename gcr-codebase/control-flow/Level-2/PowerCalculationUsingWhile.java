// Writing a program to find the power of a number using a while loop
import java.util.Scanner;
public class PowerCalculationUsingWhile {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		
		int result = 1, counter = 0;
		while(counter != power) {
			result = result * number;
			counter++;
		}
		System.out.println("The result is : " + result);
	}
}