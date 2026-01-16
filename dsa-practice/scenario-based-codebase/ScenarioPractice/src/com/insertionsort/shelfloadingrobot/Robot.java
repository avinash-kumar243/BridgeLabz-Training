package com.insertionsort.shelfloadingrobot;

import java.util.ArrayList;
import java.util.List;

public class Robot {
	List<Package> packages = new ArrayList<>();
	
	
	// Add a package
	public void addPackage(String packageId, double packageWeight) {
		Package newPackage = new Package(packageId, packageWeight);
		packages.add(newPackage); 
		System.out.println("Package added successfully");
	}
	
	
	// Sort packages - Insertion Sort
	public void sortPackages() {
		int n = packages.size();
		for(int i=1; i<n; i++) {
			int j = i-1;
			
			Package top = packages.get(i);
			while(j >= 0 && packages.get(j).getPakcageWeight() > top.getPakcageWeight()) {
				packages.set(j+1, packages.get(j)); 
				j--;
			}
			j++;
			packages.set(j, top);
		}
		System.out.println("Packages have been sorted successfully");
	}
	
	
	// View all Packages
	public void showPackages() {
		if(packages.isEmpty()) {
			System.out.println("Packages are empty");
			return;
		}
		
		System.out.println("All package details are: ");
		for(Package pkg : packages) {
			System.out.println(pkg);
		}
	}
}