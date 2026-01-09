package com.timeandspacecomplexity;

public class CompareBubbleMergeQuickSort {
	
	// Bubble Sort
	private static void bubbleSortTime(int[] nums) {
		int n = nums.length;
		
		for(int i=0; i<n-1; i++) {
			boolean isSwap = false;
			for(int j=0; j<n-i-1; j++) {
				if(nums[j] > nums[j+1]) {
					// Swap
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
	}
	
	// Merge Sort
	private static void mergeSortTime(int[] nums, int st, int end) {		
		if(st < end) {
			int mid = st + (end - st) / 2;
			mergeSortTime(nums, st, mid);
			mergeSortTime(nums, mid+1, end);
			
			merge(nums, st, mid, end);
		}
	}
	private static void merge(int[] nums, int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		System.arraycopy(nums, st, left, 0, n1);
		System.arraycopy(nums, mid+1, right, 0, n2);
		
		int i=0, j=0, k=st;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) nums[k++] = left[i++];
			else nums[k++] = right[j++];
		}
		while(i < n1) nums[k++] = left[i++];
		while(j < n2) nums[k++] = right[j++];
	}
	
	// Quick Sort
	private static void quickSortTime(int[] nums, int st, int end) {
		if(st < end) {
			// finding pivot index, and placing pivot at its correct position
			int pi = partition(nums, st, end);
			quickSortTime(nums, st, pi-1);
			quickSortTime(nums, pi+1, end);
		}
	}
	private static int partition(int[] nums, int st, int end) {
		int i = st-1;
		for(int j=st; j<end; j++) {
			if(nums[j] < nums[end]) {
				// swapping i and j element
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		// Placing pivot at its correct position
		i++;
		int temp = nums[i];
		nums[i] = nums[end];
		nums[end] = temp;
		return i;
	}

	// Main method
	public static void main(String[] args) {
		int nums[] = new int[1000];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int) (Math.random() * 1000);
 		}
		
		long bubleStartTime = System.nanoTime();
		bubbleSortTime(nums);
		long bubbleEndTime = System.nanoTime();
		System.out.println("\nBubble Sort time taken: " + (bubbleEndTime - bubleStartTime));
		
		long mergeStartTime = System.nanoTime();
		mergeSortTime(nums, 0, nums.length-1);
		long mergeEndTime = System.nanoTime();
		System.out.println("\nMerge Sort time taken: " + (mergeEndTime - mergeStartTime));
		
		
		long quickStartTime = System.nanoTime();
		quickSortTime(nums, 0, nums.length-1);
		long quickEndTime = System.nanoTime();
		System.out.println("\nQuick Sort time taken: " + (quickEndTime - quickStartTime));
	}
}