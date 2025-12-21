// Writing a program calculate the wind chill temperature given the temperature and wind speed
import java.util.Scanner;
public class WindChillCalculation {
	// calculating the wind chill temperature
	public double findRemainderAndQuotient(int temp, int windSpeed) {
		double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16); 
		return windChill;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of two numbers
		System.out.println("Enter Temperature : ");
		int temperature  = sc.nextInt();
		System.out.println("Enter Wind Speed : ");
		int windSpeed = sc.nextInt();
		
		// Calling a method to calculate the wind chill temperature
		WindChillCalculation obj = new WindChillCalculation();
		double windChill = obj.findRemainderAndQuotient(temperature, windSpeed);
		
		// Displaying the wind chill temperature
		System.out.println("The Wind Chill Temperature will be : " + windChill);
	}
}