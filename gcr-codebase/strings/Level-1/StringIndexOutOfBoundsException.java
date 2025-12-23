// Writing a program to compare two strings using the charAt() method and check the result 
import java.util.Scanner;
public class StringIndexOutOfBoundsException {
	// Writing a Method to generate the Exception
	public static void generateException(String text) {
		System.out.println(text.charAt(text.length()));
	}
	
	// Writing the Method to demonstrate NullPointerException
	public static void handlingException(String text) {
		try {
			System.out.println("Char at text length index " + text.charAt(text.length()));
		} catch(NullPointerException e) {
			System.out.println("Array Index out of bound" + e);
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of a string
		String text = sc.next();
		
		// Generate Exception
		System.out.println("\nGenerating the Index Out Of Bound Exception\n");
		generateException(text);
		
		// Handle Exception
		System.out.println("Calling method to handle the index ouut of bound exception");
		handlingException(text);
	}
}