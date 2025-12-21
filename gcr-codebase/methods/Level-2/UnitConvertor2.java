// Writing a program to implement UnitConvertor program
class Conversion {
	// Writing a method to convert yards to feet
	public static double convertYardsToFeet(double yards) {
		double yards2feet = 3;
		return yards2feet * yards;
	}
	
	// Writing a method to convert feet to yards
	public static double convertFeetToYards(double feet) {
		double feet2yards = 0.333333;
		return feet2yards * feet;
	}
	
	// Writing a method to convert meters to inches
	public static double convertMeterToInches(double meters) {
		double meters2inches = 39.3701;
		return meters2inches * meters;
	}
	
	// Writing a method to convert inches to meters
	public static double convertInchesToMeter(double inches) {
		double inches2meters  = 0.0254;
		return inches2meters * inches;
	}
	
	// Writing a method to convert inches to cm
	public static double convertInchesToCm(double inches) {
		double inches2cm = 2.54;
		return inches2cm * inches;
	}
}

public class UnitConvertor2 {
	public static void main(String args[]) {
		System.out.println("\n Conversion of 10 yards to feet is : " + Conversion.convertYardsToFeet(10));
		System.out.println("\n Conversion of 10 feet to yards is : " + Conversion.convertFeetToYards(10));
		System.out.println("\n Conversion of 10 meters to inches is : " + Conversion.convertMeterToInches(10));
		System.out.println("\n Conversion of 10 inches to meters is : " + Conversion.convertInchesToMeter(10));
		System.out.println("\n Conversion of 10 inches to cm is : " + Conversion.convertInchesToCm(10));
	}
}