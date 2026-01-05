package com.stackqueue;

import java.util.Stack;

public class StockSpanProblem {

    // Method to compute stock span for each day
    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop while current price is greater than or equal to stack top price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack empty → all previous prices were smaller
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    // Demo
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateStockSpan(prices);

        System.out.println("Stock Prices:");
        for (int p : prices) System.out.print(p + " ");

        System.out.println("\nStock Span:");
        for (int s : span) System.out.print(s + " ");
    }
}
