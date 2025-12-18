// Writing a program of printing FizzBuzz
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			for(int num = number; num >= 1; num--) {
				if(num % 3 == 0 && num % 5 == 0) System.out.println(num + " FizzBuzz");
				else if(num % 3 == 0) System.out.println(num + " Fizz");
				else if(num % 5 == 0) System.out.println(num + " Buzz");
			}
		}
	}
}