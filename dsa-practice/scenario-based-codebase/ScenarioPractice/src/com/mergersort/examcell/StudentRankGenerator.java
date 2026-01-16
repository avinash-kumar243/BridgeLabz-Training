package com.mergersort.examcell;

import java.util.ArrayList;
import java.util.List;

public class StudentRankGenerator {
	List<Student> students = new ArrayList<>();
	
	// Add a student record
    public void addStudentRecord(Student student) {
    	students.add(student);
		System.out.println("Student added");
    }
    

	// Sort student records - Merge Sort  T.C - O(NlogN) 
	public void sortStudentRecords() {
		int st = 0, end = students.size() - 1;
		
		mergeSort(st, end);
		System.out.println("Student records have been sorted in decending order");
	}
	private void mergeSort(int st, int end) {
		if(st < end) {
			int mid = st + (end - st) / 2;
			
			mergeSort(st, mid);
			mergeSort(mid+1, end);
			
			merge(st, mid, end);
		}
	}
	private void merge(int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		List<Student>left = new ArrayList<>(students.subList(st, mid+1));
		List<Student> right = new ArrayList<>(students.subList(mid+1, end+1));
			
		int i = 0, j = 0, k = st;
		
		while(i < n1 && j < n2) {
			if(left.get(i).getMarks() >= right.get(j).getMarks()) {
				students.set(k++, left.get(i++));
			} else {
				students.set(k++, right.get(j++));
			}
		}
		while(i < n1) {
			students.set(k++, left.get(i++));
		} 
		while(j < n2) {
			students.set(k++, right.get(j++));
		}
	}
	

	// Show all student records
	public void showStudentRecords() {
		if(students.isEmpty()) {
			System.out.println("No student found");
			return;
		}
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
}