// Writing a program to find the total rounds an athlete can complete around a triangular park
import java.util.Scanner;
public class CountTotalRoundOfPark {
	// Calculation of total rounds an athlete can complete
	public int numberOfRounds(int totalLength, int sideA, int sideB, int sideC) {
		int distanceInOneRound = sideA + sideB + sideC;
		return totalLength / distanceInOneRound;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for sides of a triangular parks
		System.out.println("Enter 3 sides of parks : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// Caluclating total rounds
		CountTotalRoundOfPark obj = new CountTotalRoundOfPark();
		int totalRounds = obj.numberOfRounds(5000, a, b, c);
		
		// Displaying total number of rounds to be completed
		System.out.println("Totl number of rounds to be completed are : " + totalRounds);
	}
}