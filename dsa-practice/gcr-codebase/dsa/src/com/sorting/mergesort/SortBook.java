package com.sorting.mergesort;

import java.util.Arrays;

public class SortBook {
	private static void mergeSort(int[] prices, int st, int end) {
		if(st < end) {
			int mid = st + (end - st) / 2;
			
			mergeSort(prices, st, mid);
			mergeSort(prices, mid+1, end);
			merge(prices, st, mid, end);
		}
	}
	private static void merge(int[] prices, int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		System.arraycopy(prices, st, left, 0, n1);
		System.arraycopy(prices, mid+1, right, 0, n2);
		
		int i=0, j=0, k=st;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) prices[k++] = left[i++];
			else prices[k++] = right[j++];
		}
		while(i < n1) prices[k++] = left[i++];
		while(j < n2) prices[k++] = right[j++];
	}
	public static void main(String[] args) {
		int prices[] = {400, 230, 500, 640, 370, 950, 550, 105, 240};
		
		mergeSort(prices, 0, prices.length-1);
		System.out.println(Arrays.toString(prices));
	}
}