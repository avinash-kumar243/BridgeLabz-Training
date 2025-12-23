
import java.util.*;
public class ArrayIndexOutOfBoundsExceptions {
	
	// Generating the Array Index Out Of Bound Exception
    private static void generateException(String[] names){
        System.out.println(names[names.length]);
    }

	// Handling the Array Index Out Of Bound Exception
    private static void handleException(String[] names){
        try{
            System.out.println(names[names.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }catch (RuntimeException e){
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names:");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter names:");
        for(int i = 0; i < n; i++){
            names[i] = sc.next();
        }

		// Calling methods for generating exceptions
        System.out.println("\nGenerating Exception:");
        try{
            generateException(names);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred in generateException()");
        }

		// Calling method for handling exceptions
        System.out.println("\nHandling Exception:");
        handleException(names);
    }
}
