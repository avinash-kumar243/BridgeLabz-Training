/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/


import java.util.Scanner;
public class TemperatureLoggerSystem {
	
	static Scanner sc = new Scanner(System.in);


	// Mathod to calculate Average Temperature
	public static double calculateAverageTemp(double temperature[]) {
		double sum = 0;
		for(double temp : temperature) sum += temp;
		
		return sum / temperature.length;
	}
	
	
	// Method to find maximum temperature of a week
	public static double getMaxTemperature(double temperature[]) {
		double maxTemp = temperature[0];
		for(double temp : temperature) {
			if(maxTemp < temp) maxTemp = temp;
		}
		return maxTemp;
	}
	
	
	// Method to display all the results
	public static void showDetails(String weekDays[], double temperature[], double averageTemp, double maxTemp) {
		System.out.println("\n\nWeek days name and their respective temperatures are : - ");
		for(int i=0; i<weekDays.length; i++) {
			System.out.format("\n%s : %.1f", weekDays[i], temperature[i]);
		}
		
		System.out.format("\n\nAverage temperature is : %.1f \nand max temp is : %.1f", averageTemp, maxTemp);
		System.out.println("\n");
	}
	
	// Main method
	public static void main(String args[]) {
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("------------ Temperature Logger System ------------");
		System.out.println("---------------------------------------------------\n\n");
		
		String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		double temperature[] = new double[7];
		
		System.out.println("Enter the temperature of each day of a week : \n");
		for(int i=0; i<weekDays.length; i++) {
			System.out.print(weekDays[i] + " : ");
			temperature[i] = sc.nextDouble();
		}
		
		double averageTemp = calculateAverageTemp(temperature);
		double maxTemp = getMaxTemperature(temperature);
		
		showDetails(weekDays, temperature, averageTemp, maxTemp);
	}
}