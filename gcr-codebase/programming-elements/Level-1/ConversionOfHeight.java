import java.util.Scanner;
public class ConversionOfHeight {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		
		
		double totalInches = height / 2.54;
		int feet = (int)totalInches / 12;
		double inch = totalInches % 12;
		
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inch);
	}
}	