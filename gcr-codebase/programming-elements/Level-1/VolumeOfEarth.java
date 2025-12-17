// Writing java code to calculate volume of the Earth in kilometers and in miles
public class VolumeOfEarth {
	public static void main(String args[]) {
		// Declaring variable to store pi value and radius of earth
		double pi = 3.14, radius = 6378;
		
		// Calculating volume in kilometers and miles
		double volumeInKilometer = (4.0 / 3.0) * pi * Math.pow(radius, 3);
		double volumeInMiles = volumeInKilometer * 0.6213712;
		
		// Displaying volume of the Earth in kilometers and in miles
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometer + " and cubic miles is " + volumeInMiles);
	}
}