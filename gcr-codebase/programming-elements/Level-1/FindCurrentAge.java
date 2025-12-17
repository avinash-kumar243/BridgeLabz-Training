// Writing a java program to find current age of a person
import java.util.Scanner;
public class FindCurrentAge {
	public static void main(String args[]) {
		// Providing birth year and current year
		int birthYear = 2000;
		int currentYear = 2024;

		// Calculating current age
		int currentAge = currentYear - birthYear;
		
		// Displaying current age of Harry
		System.out.println("Age of Harry is : " + currentAge);
	}
}