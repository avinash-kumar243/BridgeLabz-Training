// Writing a program to calculate totalPrice of an item
import java.util.Scanner;
public class PriceCalculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int unitPrice = sc.nextInt();
		int quantity = sc.nextInt();
		
		int totalPrice = unitPrice * quantity;
		
		// Displaying the totalPrice of an item
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}