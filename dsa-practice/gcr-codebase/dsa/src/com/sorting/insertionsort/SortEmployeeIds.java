package com.sorting.insertionsort;

public class SortEmployeeIds {
	private static void insertionSort(int[] id) {
		for(int i=1; i < id.length; i++) {
            int key = id[i];     // Element to be inserted
            int j = i-1;

            // Shift elements greater than key to one position ahead
            while(j >= 0 && id[j] > key) {
                id[j + 1] = id[j];
                j--;
            }

            // Insert key at its correct position
            id[j + 1] = key;
        }
	}
	
	private static void printSortedArray(int[] id) {
		for(int i=0; i<id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int id[] = {4, 3, 7, 2, 9, 8, 6, 10, 12, 11};
		
		insertionSort(id);
		printSortedArray(id);
	}
}