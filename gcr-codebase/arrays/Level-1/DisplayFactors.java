// Writing a program to find the factors of a number 
import java.util.Scanner;
public class DisplayFactors {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// Size of the factor array
		int maxFactor = 10;
		int factors[] = new int[maxFactor];
		
		// Calculating all the factors of a number
		int index = 0;
		int num = 1;
		while(num <= number) {
			if(number % num == 0 && index == maxFactor) {
				maxFactor *= 2;
				int temp[] = new int[maxFactor];
				for(int i=0; i<factors.length; i++) {
					temp[i] = factors[i];
				}
				factors = temp;
				factors[index++] = num;
			}
			else if(number % num == 0) {
				factors[index++] = num;
			}
			num++;
		}
		
		// Displaying all the factors of a number
		System.out.println("The factors of the number " + number + " are - ");
		for(int i=0; i<factors.length; i++) {
			if(factors[i] == 0) break;
			System.out.println(factors[i]);
		}
	}
}