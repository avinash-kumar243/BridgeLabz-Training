package com.mergersort.medwarehouse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	// Sort medicines - Merge Sort
	public static void sortMedicines(List<Medicine> medicines, int st, int end) {
		if(st < end) {
			int mid = st + (end - st) / 2;
			
			sortMedicines(medicines, st, mid);
			sortMedicines(medicines, mid+1, end);

			merge(medicines, st, mid, end);
		}
	}
	private static void merge(List<Medicine> medicines, int st, int mid, int end) {
		int n1 = mid - st + 1;
		int n2 = end - mid;
		
		List<Medicine> left = new ArrayList<>(medicines.subList(st, mid+1));
		List<Medicine> right = new ArrayList<>(medicines.subList(mid+1, end+1)); 

		int i = 0, j = 0, k = st;
		
		while(i < n1 && j < n2) {
			if(left.get(i).getExpiryDate().isBefore(right.get(j).getExpiryDate())) {
				medicines.set(k++, left.get(i++));
			} else {
				medicines.set(k++, right.get(j++));
			}
		}
		while(i < n1) {
			medicines.set(k++, left.get(i++));
		}
		while(j < n2 ) {
			medicines.set(k++, right.get(j++));
		}
	}


	// Display Medicines details
	public static void display(List<Medicine> medicines) {
		for(Medicine medicine : medicines) {
			System.out.println(medicine);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------- MedWarehouse – Sorting Medicines by Expiry (Merge Sort) ---------------");
		
		List<Medicine> medicines = new ArrayList<>();
		
		boolean isAddMedicine = true;
		while(isAddMedicine) {
			System.out.println("\nEnter 1 to add a medicine");
			System.out.println("Enter 0 to stop addding medicine");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			LocalDate medicineExpiryDate;
			switch(choice) {
				case 1:
					System.out.println("Enter medicine id: ");
					String medicineId = sc.nextLine();
					
					System.out.println("Enter medicine expiry date (dd-mm-yyyy) : ");
					String expiry = sc.nextLine();
					
					String pattern = "dd-MM-yyyy";
					
					try {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
						
						medicineExpiryDate = LocalDate.parse(expiry, formatter);
					} catch(DateTimeParseException e) {
						System.out.println("Error: The date string could not be parsed correctly");
						System.out.println("Expected format: " + pattern);
						System.out.println("Error: " + e.getMessage());
						sc.nextLine();
						continue;
					}
					
					medicines.add(new Medicine(medicineId, medicineExpiryDate)); 
					System.out.println("Medicine added");
					break;
					
				case 0:
					isAddMedicine = false;
					break;
					
				default:
					System.out.println("Invalid choice");
			}
		}
		
		
		System.out.println("\nBefore sorting, medicine details are : - \n");
		display(medicines);
		
		sortMedicines(medicines, 0, medicines.size()-1);
		
		System.out.println("\nAfter sorting of medicine expiry deadlines, medicine details are : - \n");
		display(medicines);
	}
}