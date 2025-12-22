// Writing a program to compare two strings using the charAt() method and check the result 
import java.util.Scanner;
public class NullPointerExceptionDemo {
	// Writing a Method to generate the Exception
	public static void generateException(String text) {
		System.out.println("Total charaters are : " + text.length());
	}
	
	// Writing the Method to demonstrate NullPointerException
	public static void handleException(String text) {
		try {
			System.out.println(text.length());
		} catch(NullPointerException e) {
			System.out.println("Null Poiter Exception handled!");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String text = null;
		generateException(text);
		handleException(text);
	}
}