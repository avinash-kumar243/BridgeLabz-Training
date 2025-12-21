// Writing a program to find the youngest and tallest friends
import java.util.*;
public class FindYoungestFriend {
	// finding youngest among all 3 friends
	public static int youngestFriendCal(int age[]) {
		int leastAgeIdx = 0;
		for(int i=0; i<age.length; i++) {
			if(age[i] < age[leastAgeIdx]) leastAgeIdx = i;
		}
		return leastAgeIdx;
	}
	
	// finding tallest among all 3 friends
	public static int tallestFriendCal(int height[]) {
		int largeHeightIdx = 0;
		for(int i=0; i<height.length; i++) {
			if(height[i] > height[largeHeightIdx]) largeHeightIdx = i;
		}
		return largeHeightIdx;
	}
	
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
		
		// Calling methods to find youngest and tallest friend
		int leastAgeIdx = youngestFriendCal(age);
		int largeHeightIdx = tallestFriendCal(height);
		
		// Displaying the youngest and tallest friends
		if(leastAgeIdx == 0) System.out.println("Youngest friend is : Amar");
		else if(leastAgeIdx == 1) System.out.println("Youngest friend is : Akbar");
		else System.out.println("Youngest friend is : Anthony");
		
		if(largeHeightIdx == 0) System.out.println("tallest friend is : Amar");
		else if(largeHeightIdx == 1) System.out.println("tallest friend is : Akbar");
		else System.out.println("tallest friend is : Anthony");
	}
}