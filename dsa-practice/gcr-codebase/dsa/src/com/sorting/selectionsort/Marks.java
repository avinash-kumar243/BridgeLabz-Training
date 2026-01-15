package com.sorting.selectionsort;

import java.util.Scanner;

public class Marks {
	public static void selectionSort(int marks[]) {
		int n = marks.length;
		
		for(int i=0; i<n-1; i++) {
			int pos = i;
			
			int j = i + 1;
			while(j < n) {
				if(marks[pos] > marks[j]) pos = j;
				j++;
			}
			
			// Swapping - put smallest element at i position
			int temp = marks[i];
			marks[i] = marks[pos];
			marks[pos] = temp;
		}
	}
	public static void printSortedArray(int marks[]) {
		System.out.println("\nStudents marks in sorted order are : - ");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of student marks");
		int size = sc.nextInt();
		
		int marks[] = new int[size];
		
		System.out.println("Enter student marks");
		for(int i=0; i<size; i++) {
			marks[i] = sc.nextInt();
		}
		
		selectionSort(marks);
		printSortedArray(marks);
	}
}