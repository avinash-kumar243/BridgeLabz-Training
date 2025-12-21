// Writing a program to divide N number of chocolates among M children
import java.util.Scanner;
public class ChocolateDistribution {
	// Finding quotient of two numbers
	public static int[] findRemainderAndQuotient(int chocolates, int children) {
		int result[] = new int[2]; 
		result[0] = chocolates / children;
		result[1] = chocolates % children;
		
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of two numbers
		System.out.println("Enter number of chocolates : ");
		int numberOfchocolates  = sc.nextInt();
		System.out.println("Enter number of children : ");
		int numberOfChildren = sc.nextInt();
		
		// Calling a method to distribute chocolates among children
		int result[] = findRemainderAndQuotient(numberOfchocolates, numberOfChildren);
		
		// Displaying the total number of chocolates those are distributed and non-distributed among the children
		System.out.println("Total distributed chocolates are : " + result[0] + ", and remaining chocolates are : " + result[1]);
	}
}