public class ConvertDistanceToMiles {
	public static void main(String args[]) {
		
		// Distance is given in Kilometers
		double distanceInKilometers = 10.8;
				
		// Distance is Miles
		double distanceInMiles = distanceInKilometers * 1.6;
		System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
	}
}