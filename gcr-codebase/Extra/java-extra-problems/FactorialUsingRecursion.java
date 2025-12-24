import java.util.Scanner;
public class FactorialUsingRecursion {

    // Method to take input from user
    private static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    private static long factorial(int n) {

        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method to display result
    private static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is : " + result);
    }

    public static void main(String[] args) {
        int number = takeInput();
        long result = factorial(number);
        displayResult(number, result);
    }
}