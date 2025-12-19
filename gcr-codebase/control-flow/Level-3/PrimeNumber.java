// Writing a program to check a number is prime or not	
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		for(int num = 2; num < number; num++) {
			if(number % num == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) System.out.println(number + " is a Prime number");
		else System.out.println(number + " is not a Prime number");
	}
}