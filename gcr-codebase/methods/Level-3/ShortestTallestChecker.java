// Writing a program to find the shortest, tallest, and mean height of players
import java.util.*;
public class ShortestTallestChecker {
	// A method to find the sum of all the elements
	public static int sumOfHeight(int nums[]) {
		int sum = 0;
		for(int num : nums) sum += num;
		return sum;
	}
	
	// A method to find the mean height
	public static double meanHeight(int nums[], int sum) {
		return (double)sum / (double)nums.length;
	}
	
	// A method to find the shortest height of the players
	public static int shortestHeight(int nums[]) {
		int minHeight = nums[0];
		for(int height : nums) {
			if(height < minHeight) minHeight = height;
		}
		return minHeight;
	}
	
	// A method to find the tallest height of the players
	public static int tallestHeight(int nums[]) {
		int maxHeight = nums[0];
		for(int height : nums) {
			if(height > maxHeight) maxHeight = height;
		}
		return maxHeight;
	}
	
	// A method to display the result
	public static void display(int sum, double mean, int shortestHeight, int tallestHeight) {
		System.out.println("Sum of height is : " + sum);
		System.out.println("Mean of height is : " + mean);
		System.out.println("ShortestHeight is : " + shortestHeight);
		System.out.println("Tallest height is : " + tallestHeight);
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Creating an int array and getting 3 digits random height in cms
		int height[] = new int[11];
		Random random = new Random();;
		for(int i=0; i<height.length; i++) {
			// random.nextInt(100) will generate random number from 1 to 100
			height[i] = random.nextInt(100) + 150;
		}
		
		// Displaying all random heights
		System.out.println("Players heights are : ");
		for(int ht : height) System.out.println(ht);
		
		
		// Getting all the operational results
		int sum = sumOfHeight(height);
		double mean = meanHeight(height, sum);
		int shortestHeight = shortestHeight(height);
		int tallestHeight = tallestHeight(height);
		
		display(sum, mean, shortestHeight, tallestHeight);
	}
}