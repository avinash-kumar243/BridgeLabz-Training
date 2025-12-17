import java.util.Scanner;
public class FindCurrentAge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int birthYear = 2000;
		int currentYear = 2024;
		
		int currentAge = currentYear - birthYear;
		System.out.println("Age of Harry is : " + currentAge);
	}
}