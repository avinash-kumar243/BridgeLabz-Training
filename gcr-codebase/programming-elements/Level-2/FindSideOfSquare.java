// Writing a java program to find side of a Square whose perimeter is given
import java.util.Scanner;
public class FindSideOfSquare {
	public static void main(String args[]) {
		// Creating a scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		// Taking inputs from user
		System.out.println("Enter Perimeter : ");
		int perimeter = sc.nextInt();
		
		// Calculating side of a square 
		double side = perimeter / 4.0;
		
		// Displaying side of a square
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}