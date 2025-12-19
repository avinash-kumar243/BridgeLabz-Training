// Writing a program to display whether a number is positive,  negative, or zero
import java.util.Scanner;
public class DisplayNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int[5];
		System.out.print("Enter 5 numbers : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > 0) {
				if(nums[i] % 2 == 0) System.out.println(nums[i] + " Even Number");
				else System.out.println(nums[i] + " Odd Number");
			} else if (nums[i] < 0) System.out.println(nums[i] + " Negative Number");
			else System.out.println(nums[i] + " Zero");
		}
		
		if(nums[0] > nums[nums.length - 1]) System.out.println("First number is greater than last number");
		else if(nums[0] < nums[nums.length - 1]) System.out.println("First number is smaller than last number");
		else System.out.println("Both numbers are equal");
	}
}	