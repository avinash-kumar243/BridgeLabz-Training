package com.stackqueue;

import java.util.*;

public class SlidingWindowMaximum {

    // Returns array of maximums for each sliding window
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];

        Deque<Integer> dq = new ArrayDeque<>(); // stores indices
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // Remove indices out of the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            // Add current index
            dq.addLast(i);

            // Record max once first window is complete
            if (i >= k - 1) {
                result[idx++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    // Demo
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums:");
        for (int x : ans) System.out.print(x + " ");
    }
}
