// Writing a program to find the youngest and tallest friends
import java.util.*;
public class FindYoungestFriend {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for age and height for all three friends
		int age[] = new int[3];
		System.out.println("Enter age of all three friends : ");
		for(int i=0; i<age.length; i++) {
			age[i] = sc.nextInt();
		}
		int height[] = new int[3];
		System.out.println("Enter height of all three friends : ");
		for(int i=0; i<height.length; i++) {
			height[i] = sc.nextInt();
		}
		
		
		// finding youngest and tallest among all 3 friends
		int leastAgeIdx = 0;
		int largeHeightIdx = 0;
		for(int i=0; i<age.length; i++) {
			if(age[i] < age[leastAgeIdx]) leastAgeIdx = i;
			if(height[i] > height[largeHeightIdx]) largeHeightIdx = i;
		}
		
		// Displaying the youngest and tallest friends
		if(leastAgeIdx == 0) System.out.println("Youngest friend is : Amar");
		else if(leastAgeIdx == 1) System.out.println("Youngest friend is : Akbar");
		else System.out.println("Youngest friend is : Anthony");
		
		if(largeHeightIdx == 0) System.out.println("tallest friend is : Amar");
		else if(largeHeightIdx == 1) System.out.println("tallest friend is : Akbar");
		else System.out.println("tallest friend is : Anthony");
	}
}