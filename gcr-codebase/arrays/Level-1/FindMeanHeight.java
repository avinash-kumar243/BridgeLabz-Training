// Writing a program to find the mean height of players present in a football team
import java.util.Scanner;
public class FindMeanHeight {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the heights : ");
		double heights[] = new double[11];
		for(int i=0; i<heights.length; i++) {
			heights[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i=0; i<heights.length; i++) {
			sum += heights[i];
		}
		System.out.println("Mean height is : " + (sum / 11));
	}
}  