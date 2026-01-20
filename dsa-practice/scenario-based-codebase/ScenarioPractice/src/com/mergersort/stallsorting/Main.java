package com.mergersort.stallsorting;

public class Main {
	public static void main(String args[]) {		
		System.out.println("\n-------------- FoodFest – Sorting Stalls by Customer Footfall (Merge Sort) --------------\n");
		
		Stall stalls[] = {new Stall("Swad Wala Stall", 10), new Stall("Fresh Feast", 16), new Stall("Flavor Rush", 8), new Stall("The Grub Hub", 25), new Stall("Street Feast", 24)};
		
		
		System.out.println("\nBefore soting all stalls details are: \n");
		display(stalls);
		
		
		// Sorting stalls
		sortStalls(stalls, 0, stalls.length-1);

		
		System.out.println("\n\nAfter soting by customer count, all stalls details are: \n");
		display(stalls);
	}
	
	
	// Sort stalls by customer count - Merge Sort
	private static void sortStalls(Stall[] stalls, int st, int end) {
		if(st < end) {
			int mid = st + (end - st) / 2;
			
			sortStalls(stalls, st, mid);
			sortStalls(stalls, mid+1, end);
			
			merge(stalls, st, mid, end);
		}
	}
	
	// Method to merge sorted array 
	private static void merge(Stall[] stalls, int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		Stall left[] = new Stall[n1];
		Stall right[] = new Stall[n2];
		
		System.arraycopy(stalls, st, left, 0, n1);
		System.arraycopy(stalls, mid+1, right, 0, n2);
		
		int i = 0, j = 0, k = st;
		
		while(i < n1 && j < n2) {
			if(left[i].getCustomerCount() > right[j].getCustomerCount()) {
				stalls[k++] = left[i++];
			} else {
				stalls[k++] = right[j++];
			}
		}
		while(i < n1) {
			stalls[k++] = left[i++];
		}
		while(j < n2) {
			stalls[k++] = right[j++];
		}
	}


	// Display stall details
	private static void display(Stall[] stalls) {
		for(Stall stall : stalls) {
			System.out.println(stall);
		}
	}
}