// Writing a java program to calculate student fee after a discount
import java.util.Scanner;
public class CalculateCourseFee {
	public static void main(String args[]) {
		// Created a scanner object for taking the input from the user
		Scanner sc = new Scanner(System.in);
		
		// Taking user fee and discount percent
		System.out.println("Enter fee : ");
		int fee = sc.nextInt();
		System.out.println("Enter discount percent : ");
		int discountPercent = sc.nextInt();
		
		// Calculating the discount and final fee
		double discount = (double)fee * discountPercent / 100;
		double feeAfterDiscount = fee - discount;
		
		// Displaying the discount and final discounted fee
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + feeAfterDiscount);
	}
}