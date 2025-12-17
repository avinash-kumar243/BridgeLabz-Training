// Writing java code to take user distance in kilometers and convert it into miles
import java.util.Scanner;
public class DistanceConversion {
	public static void main(String args[]) {
		// Creating Scanner Object for taking the input from the user
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		
		// Calculating the distance into miles from kilometers
		double miles = km * 1.6;
		
		// Displaying the distance into miles
		System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	}
}