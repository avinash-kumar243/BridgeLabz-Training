// Writing a program of printing FizzBuzz
import java.util.*;
public class FizzBuzzUsingArray {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		// Adding the result into the string array
		ArrayList<String> al = new ArrayList<>();
		if(number >= 0) {
			for(int num = 0; num <= number; num++) {
				if(num % 3 == 0 && num % 5 == 0) al.add("FizzBuzz");
				else if(num % 3 == 0) al.add("Fizz");
				else if(num % 5 == 0) al.add("Buzz");
			}
		}
		
		// Displaying all the results
		System.out.println("The result of the arrays are : ");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}