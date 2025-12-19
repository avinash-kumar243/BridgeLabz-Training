// Writing a program to find the power of a number
import java.util.Scanner;
public class PowerCalculation {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		
		if(number >=0 && power>= 0) {
			System.out.println("number and power are positive integers");

			int result = 1;
			for(int i=1; i<=power; i++) {
				result = result * number;
			}
			System.out.println("The result is : " + result);
		}
	}
}