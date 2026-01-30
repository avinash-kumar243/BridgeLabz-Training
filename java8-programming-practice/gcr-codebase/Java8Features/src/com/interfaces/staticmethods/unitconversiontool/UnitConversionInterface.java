package com.interfaces.staticmethods.unitconversiontool;

public interface UnitConversionInterface {
	static double kilometertomiles(double km) {
		return km * 0.621371;
	}
	static double kilogramtolbs(double kg) {
		return kg * 2.20462; 
	}
}