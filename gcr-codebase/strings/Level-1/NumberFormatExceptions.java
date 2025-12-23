import java.util.*;

public class NumberFormatExceptions {
	
	// Generating the Number Format Exception
    private static void generateException(String text){
        int num = Integer.parseInt(text);  
        System.out.println("Number is: " + num);
    }

	// Handling the Number Format Exception
    private static void handleException(String text){
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        String text = sc.next();

		// Calling methods for generating exceptions
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch(NumberFormatException e) {
            System.out.println("Exception occurred in generateException()");
        }

        // Calling method for handling exceptions
        System.out.println("\nHandling Exception:");
        handleException(text);
    }
}
