package com.sorting.bubblesort;

public class SortStudentMarks {
	public static void bubbleSort(int marks[]) {
		int n = marks.length;
		boolean isSorted = true;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(marks[j] > marks[j+1]) {
					// Swap
					isSorted = false;
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
			if(isSorted) break;
		}
	}
	public static void printSortedArray(int marks[]) {
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
	}
	public static void main(String[] args) {
		int marks[] = {46, 37, 74, 29, 92, 85, 66, 90, 82};
		
		bubbleSort(marks);
		printSortedArray(marks);
	}
}