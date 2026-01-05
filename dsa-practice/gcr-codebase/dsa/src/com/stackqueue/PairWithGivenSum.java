package com.stackqueue;

import java.util.*;

public class PairWithGivenSum {

    // Returns true if a pair exists, otherwise false
    public static boolean hasPairWithSum(int[] arr, int target) {
        Map<Integer, Boolean> seen = new HashMap<>();

        for (int value : arr) {
            int complement = target - value;

            if (seen.containsKey(complement)) {
                return true; // pair found
            }

            seen.put(value, true);
        }

        return false; // no pair exists
    }

    // Demo
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int target = 10;

        boolean result = hasPairWithSum(arr, target);

        if (result)
            System.out.println("Pair with sum " + target + " exists.");
        else
            System.out.println("No pair found for sum " + target + ".");
    }
}
