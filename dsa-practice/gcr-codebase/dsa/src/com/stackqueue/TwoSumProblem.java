package com.stackqueue;

import java.util.*;

public class TwoSumProblem {

    // Returns indices of the two numbers that add up to target
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement already seen
            if (indexMap.containsKey(complement)) {
                return new int[] { indexMap.get(complement), i };
            }

            // Store current value and index
            indexMap.put(nums[i], i);
        }

        // No valid pair found
        return new int[] { -1, -1 };
    }

    // Demo
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
