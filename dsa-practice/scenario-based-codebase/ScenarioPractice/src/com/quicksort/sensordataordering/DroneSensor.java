package com.quicksort.sensordataordering;

import java.util.ArrayList;
import java.util.List;

public class DroneSensor {
	List<Soil> soilTemperatures = new ArrayList<>();
	
	
	// Add soil temperature
	public void measureSoilTemperature(Soil newSoil) {
		soilTemperatures.add(newSoil);
		System.out.println("Soil Temperature measured"); 
	}
	
	
	// Sort Soil temperatures - Quick Sort
	public void sortSoilTemperature() {
		int st = 0, end = soilTemperatures.size()-1;
		
		quickSort(st, end);
		
		System.out.println("Soil temperature have been sorted");
	}
	private void quickSort(int st, int end) {
		if(st < end) {
			int pi = partition(st, end);
			
			quickSort(st, pi-1);
			quickSort(pi+1, end);
		}
	}
	private int partition(int st, int end) {
		int i = st-1;
		
		for(int j=st; j<end; j++) {
			if(soilTemperatures.get(j).getTime().isBefore(soilTemperatures.get(end).getTime())) {
				i++;
				Soil soil = soilTemperatures.get(i);
				soilTemperatures.set(i, soilTemperatures.get(j));
				soilTemperatures.set(j, soil);
			}
		}
		
		i++;
		Soil soil = soilTemperatures.get(i);
		soilTemperatures.set(i, soilTemperatures.get(end));
		soilTemperatures.set(end, soil);
		
		return i; 
	}


	// View all measured soil temperature
	public void showSoilTemperature() {
		if(soilTemperatures.isEmpty()) { 
			System.out.println("Data not found");
			return;
		}
		
		System.out.println("Measured soil temperatures are: ");
		for(Soil soilTemp : soilTemperatures) {
			System.out.println(soilTemp);
		}
	}
}