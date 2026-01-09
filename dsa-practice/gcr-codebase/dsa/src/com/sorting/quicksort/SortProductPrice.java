package com.sorting.quicksort;

import java.util.Arrays;

public class SortProductPrice {
	private static void quickSort(int[] prices, int st, int end) {
		if(st < end) {
			int pi = partition(prices, st, end);
			
			quickSort(prices, st, pi-1);
			quickSort(prices, pi+1, end);
		}
	}
	private static int partition(int[] prices, int st, int end) {
		int i = st - 1;
		for(int j=st; j<end; j++) {
			if(prices[j] < prices[end]) {
				// swap ith and jth element
				i++;
				int temp = prices[i];
				prices[i] = prices[j];
				prices[j] = temp;
			}
		}
		i++;
		int temp = prices[i];
		prices[i] = prices[end];
		prices[end] = temp;
		return i;
	}
	public static void main(String[] args) {
		int prices[] = {25, 40, 34, 98, 68, 56, 70, 85, 42};
		
		quickSort(prices, 0, prices.length-1);
		System.out.println("Sorted prices are: \n" + Arrays.toString(prices));
	}
}