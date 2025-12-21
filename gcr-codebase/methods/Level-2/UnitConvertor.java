// Writing a program to implement UnitConvertor program
public class UnitConvertor {
	// Writing a Method To convert kilometers to miles
	public static double convertKmToMiles(double km) {
		double km2miles = 0.621371;
		return km2miles * km;
	}
	
	// Writing a Method to convert miles to kilometers
	public static double convertMilestoKm(double miles) {
		double miles2km = 1.60934;
		return miles2km * miles;
	}
	
	// Writing a Method to convert meters to feet
	public static double convertMeterToFeet(double meter) {
		double meters2feet = 3.28084;
		return meters2feet * meter;
	}
	
	// Writing a Method to convert feet to meters
	public static double convertFeetToMeter(double feet) {
		double feet2meters = 0.3048;
		return feet2meters * feet;
	}
	
	public static void main(String args[]) {
		double km = 10;
		double km2miles = convertKmToMiles(km);
		System.out.println("\n For 10 kilometers, Distance in miles is " + km2miles);
		
		double miles = 10;
		double miles2km = convertMilestoKm(miles);
		System.out.println("\n For 10 miles, Distance in kilometers is " + miles2km);
		
		double meter = 10;
		double meter2feet = convertMeterToFeet(meter);
		System.out.println("\n for 10 meters, Length in feet is " + meter2feet);
		
		double feet = 10;
		double feet2meter = convertFeetToMeter(feet);
		System.out.println("\n For 10 foot, Length in meter is " + feet2meter);
	}
} 