// Writing a program to find greatest factor of a number using while loop
import java.util.Scanner;
public class FindMultiples {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		if(number >= 0 && number < 100) {
			System.out.println("Number is a positive integer and less than 100");
			for(int i=100; i>=1; i--) {
				if(number % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}