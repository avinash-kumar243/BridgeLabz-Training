// Writing a program to calculate discount given on fees and final payable fee
public class CourseFeeCalculation {
	public static void main(String args[]) {
		// Creating variables that will store fees and discountPercent
		int fee = 125000, discountPercent = 10;
		
		// Calculating discounte and final amount to pay
		int discountAmount = (int)(fee * (double)discountPercent / 100);  
		int discountedFee = fee - discountAmount;
		
		// Displaying total discount and final amount to pay
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
	}
}