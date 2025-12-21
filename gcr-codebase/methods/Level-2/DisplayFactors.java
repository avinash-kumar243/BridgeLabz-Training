// Writing a program to find the factors of a number 
import java.util.Scanner;
public class DisplayFactors {
	// Storing factors into the array
	public static int[] storeFactors(int number) {
		// Finding the size of the array
		int size = 0;
		for(int i=1; i<=number; i++) {
			if(number % i == 0) size++;
		}
		
		// storing each factor into the array
		int factors[] = new int[size];
		int idx = 0;
		for(int i=1; i<=number; i++) {
			if(number % i == 0) factors[idx++] = i;
		}
		return factors;
	}
	
	// Displaying factors
	public static void displayFactor(int number, int factors[]) {
		System.out.println("All the factors of the number " + number + " are : ");
		for(int num : factors) System.out.println(num);
	}

	// Calculating sum of Factors
	public static int sumOfFactors(int factors[]) {
		int sumOfFactors = 0;
		for(int num : factors) sumOfFactors += num;
		return sumOfFactors;
	}
	
	// Calculating sum of Square of Factors
	public static int sumOfSquareOfFactors(int factors[]) {
		int sumOfSquareOfFactors = 0;
		for(int num : factors) sumOfSquareOfFactors += (num * num);
		return sumOfSquareOfFactors;
	}
	
	// Calculating product of Factors
	public static int productOfFactors(int factors[]) {
		int productOfFactors = 1;
		for(int num : factors) productOfFactors *= num;
		return productOfFactors;
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking a number from user
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		
		// Storing factors into the array
		int factors[] = storeFactors(number);
		
		// Displaying factors, sumOfFactors, sumOfSquareOfFactors, and productOfFactors of a number
		displayFactor(number, factors);
		
		int factorSum = sumOfFactors(factors);
		System.out.println("Sum of factors are : " + factorSum);
		
		int factorSquareSum = sumOfSquareOfFactors(factors);
		System.out.println("Sum of Square of factors are : " + factorSquareSum);
		
		int factorProduct = productOfFactors(factors);
		System.out.println("Product of factors are : " + factorProduct);	
	}
}