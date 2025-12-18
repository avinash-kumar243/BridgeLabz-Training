// Writing a java program to find distance in yards and miles
import java.util.Scanner;
public class CalculateDistance {
	public static void main(String args[]) {
		// Creating a scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		// Taking distance from user
		System.out.println("Enter distance in feet : ");
		double distanceInFeet = sc.nextDouble();
		
		// Calculating distance in yards and miles 
		double distanceInYards = (1/3.0) * distanceInFeet;
		double distanceInMiles = (1/1760.0) * distanceInYards;
		
		// Displaying distance in yards and miles
		System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
	}
}