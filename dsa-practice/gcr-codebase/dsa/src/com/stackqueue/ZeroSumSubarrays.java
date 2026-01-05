package com.stackqueue;

import java.util.*;

public class ZeroSumSubarrays {

    // Returns list of all subarray index-pairs whose sum = 0
    public static List<int[]> findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        int prefixSum = 0;

        // Handle prefix sum 0 from index 0
        sumIndexMap.put(0, new ArrayList<>());
        sumIndexMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefix sum seen before → zero-sum subarrays exist
            if (sumIndexMap.containsKey(prefixSum)) {
                for (int startIndex : sumIndexMap.get(prefixSum)) {
                    result.add(new int[] { startIndex + 1, i });
                }
            }

            // Store current index for this prefix sum
            sumIndexMap.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    // Demo
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, -4, -2, -2};

        List<int[]> zeroSumSubarrays = findZeroSumSubarrays(arr);

        System.out.println("Zero-sum subarrays (startIndex, endIndex):");
        for (int[] pair : zeroSumSubarrays) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
