// Writing a program to find the factors of a number and perform various tasks using the factors array
import java.util.Scanner;
public class FactorCalculation {
    // Method to find factors of a number
    public static int[] findFactors(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int idx = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                factors[idx++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor using factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for(int i = 1; i < factors.length; i++) {
            if(factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // Method to find sum of all the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for(int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for(int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of all factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for(int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}