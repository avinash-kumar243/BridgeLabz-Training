package com.mergesort.zipzapmart;

import java.util.ArrayList;
import java.util.List;

public class SortTransaction {
	List<Transaction> allTransactions = new ArrayList<>();

	
	// Adding a transaction
	public void addTransaction(Transaction transaction) {
		allTransactions.add(transaction);
		System.out.println("Transaction added");
		return; 
	}
	

	// Sorting all transactions based on date and amount using merge sort
	public void sortTransactions() {
		if(allTransactions.size() == 0) { 
			System.out.println("Empty transactions");
			return; 
		}
		else if(allTransactions.size() == 1) {
			System.out.println("Already sorted");
			return; 
		}
		
		System.out.println("All Transactions have been sorted");
		int st = 0, end = allTransactions.size()-1;
		mergeSort(st, end);
		
	}
	private void mergeSort(int st, int end) {
		if(st >= end) return;
		
		int mid = (st + end) / 2;
		
		mergeSort(st, mid);
		mergeSort(mid+1, end);
		merge(st, mid, end);
	}
	private void merge(int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		List<Transaction> left = new ArrayList<>(allTransactions.subList(st, mid+1));
		List<Transaction> right = new ArrayList<>(allTransactions.subList(mid+1, end+1));
		
		int i = 0, j = 0, k = st;
		
		while(i < left.size() && j < right.size()) {
			Transaction lt = left.get(i);
			Transaction rt = right.get(j);
			
			// case 1 : Compare by date
			if(lt.getDate().isBefore(rt.getDate())) {
				allTransactions.set(k++, lt);
				i++;
			} else if(lt.getDate().isAfter(rt.getDate())) {
				allTransactions.set(k++, rt);
				j++;
			} else {   // equal date -> sort by amount
				if(lt.getAmount() <= rt.getAmount()) {
					allTransactions.set(k++, lt);
					i++;
				} else {
					allTransactions.set(k++, rt);
					j++;
				}
			}
		}
		
		while(i < left.size()) {
			allTransactions.set(k++, left.get(i));
			i++;
		}
		while(j < right.size()) {
			allTransactions.set(k++, right.get(j));
			j++;
		}
		
	}
	 
	
	// Printing all transactions
	public void showAllTransactions() {
		if(allTransactions.size() == 0) {
			System.out.println("Empty transactions");
		}
		
		for(Transaction transaction : allTransactions) {
			System.out.println(transaction);
		} 
	}
}