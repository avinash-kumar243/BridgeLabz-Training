// Writing a program to Copy the 2D Array into a single dimension array
import java.util.Scanner;
public class MultiDimensionalArray {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking row and columns from user
		System.out.println("Enter rows : ");
		int row = sc.nextInt();
		System.out.println("Enter columns : ");
		int column = sc.nextInt();
		
		// Taking the user input in 2D array
		int arr[][] = new int[row][column];
		System.out.println("Enter " + (row * column) + " numbers");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// Copying Multi-Dimensional array elements into one dimentional array
		int copyArray[] = new int[row * column];
		int idx = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				copyArray[idx++] = arr[i][j];
			}
		}
		
		// Displaying each elements from copyArray
		for(int num : copyArray) System.out.println(num);
	}
}