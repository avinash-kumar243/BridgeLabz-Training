// Writing a program to implement UnitConvertor program 3
class Conversion {
	// Writing a method to convert farhenheit to celsius
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	
	// Writing a method to convert celsius to farhenheit
	public static double convertCelsiusToFarhenheit(double celsius) {
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	
	// Writing a method to convert pounds to km
	public static double convertPoundsToKilometers(double pounds) {
		double pounds2kilograms = 0.453592;
		return pounds2kilograms * pounds;
	}
	
	// Writing a method to convert km to pounds
	public static double convertKilometersToPounds(double km) {
		double kilograms2pounds = 2.20462; 
		return kilograms2pounds * km;
	}
	
	// Writing a method to convert gallons to liters 
	public static double convertGallonsToLiters(double gallons) {
		double gallons2liters = 3.78541; 
		return gallons2liters * gallons;
	}
	
	// Writing a method to convert liters to gallons
	public static double convertLitersToGallons(double liters) {
		double liters2gallons = 0.264172; 
		return liters2gallons * liters;
	}
}

public class UnitConvertor3 {
	public static void main(String args[]) {
		System.out.println("\n Conversion of 10 farhenheit to celsius is : " + Conversion.convertFarhenheitToCelsius(10));
		System.out.println("\n Conversion of 10 celsius to farhenheit is : " + Conversion.convertCelsiusToFarhenheit(10));
		System.out.println("\n Conversion of 10 pounds to km is : " + Conversion.convertPoundsToKilometers(10));
		System.out.println("\n Conversion of 10 km to pounds is : " + Conversion.convertKilometersToPounds(10));
		System.out.println("\n Conversion of 10 gallons to liters is : " + Conversion.convertGallonsToLiters(10));
		System.out.println("\n Conversion of 10 liters to gallons is : " + Conversion.convertLitersToGallons(10));
	}
}