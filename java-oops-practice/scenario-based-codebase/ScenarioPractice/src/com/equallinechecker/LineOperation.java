package com.equallinechecker;

import java.util.ArrayList;
import java.util.List;

public class LineOperation {
	
	// List always store maximum 2 lines
	List<Line> lines = new ArrayList<>();

	
	// Add line details
	public void addLine(Line line) {
		lines.add(line);
		System.out.println("Line added");
	}

	
	// Compare both line details
	public void compareLines() {
		double line1Length = findLength(lines.get(0));
		double line2Length = findLength(lines.get(1));
		
		System.out.printf("Length of line 1 is : %.1f%n", line1Length);
		System.out.printf("Length of line 2 is : %.1f%n%n", line2Length);
		
		if(line1Length == line2Length) System.out.println("Both lines of equal length");
		else if(line1Length > line2Length) System.out.println("Line 1 is longer");
		else System.out.println("Line 2 is longer"); 
	}
	private double findLength(Line line) { 
		double diff1 = line.getX1() - line.getX2();
		double diff2 = line.getY1() - line.getY2();
		
		double result = Math.pow(diff1, 2) + Math.pow(diff2, 2);
		return Math.sqrt(result);
	}
	
	
	// Show line details
	public void showLineDetails() {
		if(lines.isEmpty()) {
			System.out.println("No line present");
			return;
		}
		
		int count = 1;
		System.out.println();
		for(Line line : lines) {
			System.out.println("Line " + count + " details are : ");
			System.out.println(line);			
			count++;
		}
	}
}