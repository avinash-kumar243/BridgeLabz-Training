package com.interfaces.staticmethods.unitconversiontool;

public class Main {
	public static void main(String[] args) {
		double km = 4.5;
		double kg = 6.2;
		
		double miles = UnitConversionInterface.kilometertomiles(km);
		double lbs = UnitConversionInterface.kilogramtolbs(kg);
		
		System.out.format("%.2fkm in miles: %.2f\n", km, miles);
		System.out.format("%.2fkg in lbs: %.2f", kg, lbs);
	}
}