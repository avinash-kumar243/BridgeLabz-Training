package com.stackqueue;

import java.util.*;

public class CircularTourProblem {
    public static int findStartingPump(int[] petrol, int[] distance) {

        int n = petrol.length;
        Queue<Integer> queue = new ArrayDeque<>();

        int start = 0;          // tentative start index
        int surplus = 0;        // current petrol balance
        int deficit = 0;        // petrol shortage count

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];
            queue.add(i);

            // If surplus falls below 0, reset start position
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
                queue.clear(); // restart simulation
            }
        }

        // Check if tour is possible
        return (surplus + deficit >= 0) ? start : -1;
    }

    // Demo
    public static void main(String[] args) {
        int[] petrol  = {6, 3, 7};
        int[] distance = {4, 6, 3};

        int startPump = findStartingPump(petrol, distance);

        if (startPump == -1)
            System.out.println("No feasible starting point. Tour not possible.");
        else
            System.out.println("Start the tour from pump index: " + startPump);
    }
}
