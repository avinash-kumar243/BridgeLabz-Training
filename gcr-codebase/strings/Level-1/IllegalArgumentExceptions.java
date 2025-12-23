// Writing a method to demonstrate IllegalArgumentException
import java.util.Scanner;
public class IllegalArgumentExceptions {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        String sub = text.substring(4, 2);
        System.out.println(sub);
    }

    // Method to handle IllegalArgumentException
    public static void handlingException(String text) {
        try {
            String sub = text.substring(4, 2);
            System.out.println("Substring is: " + sub);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call method to generate exception
        System.out.println("\nGenerating IllegalArgumentException\n");
        try {
            generateException(text);
        } catch (RuntimeException e) {
            System.out.println("Program stopped due to Runtime Exception\n");
        }

        // Call method to handle exception
        System.out.println("Handling IllegalArgumentException\n");
        handlingException(text);
    }
}