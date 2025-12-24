import java.util.Scanner;
public class GCDLCMCalculator {
    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        // Calling methods
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcm);
    }
}