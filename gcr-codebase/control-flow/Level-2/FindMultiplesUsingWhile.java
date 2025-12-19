// Writing a program to find all the multiples of a number below 100 using while loop
import java.util.Scanner;
public class FindMultiplesUsingWhile {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		if(number >= 0 && number < 100) {
			System.out.println("Number is a positive integer and less than 100");
			int counter = number - 1;
			while(counter > 1) {
				if(number % counter == 0) {
					System.out.println(counter);
				}
				counter--;
			}
		}
	}
}