// Writing a program of printing FizzBuzz using while loop
import java.util.Scanner;
public class FizzBuzzUsingWhileLoop {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			while(number >= 1) {
				if(number % 3 == 0 && number % 5 == 0) System.out.println(number + " FizzBuzz");
				else if(number % 3 == 0) System.out.println(number + " Fizz");
				else if(number % 5 == 0) System.out.println(number + " Buzz");
				number--;
			}
		}
	}
}