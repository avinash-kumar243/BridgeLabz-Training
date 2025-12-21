// Writing a program that generates five 4 digit random values and perform operations
public class RandomNumberGeneration {
	
	// Writing a method to generates five 4 digit random values
	public int[] generate4DigitRandomArray(int size) {
		int arr[] = new int[size];
		
		arr[0] = (int)(Math.random() * 10000);
		arr[1] = (int)(Math.random() * 10000);
		arr[2] = (int)(Math.random() * 10000);
		arr[3] = (int)(Math.random() * 10000);
		arr[4] = (int)(Math.random() * 10000);
		
		// Printing random numbers
		for(int i=0; i<size; i++) {
			System.out.println("Random number " + arr[i]);
		}
		return arr;
	}
	
	// Calculate average, min, and max value
	public double[] findAverageMinMax(int numbers[]) {
		double []result = new double[3];
		
		
		// Calculating sum, min, and max value
		int sum = 0, min = 10000, max = 0;
		for(int num : numbers) {
			sum += num;
			
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		// Calculating average of the random numbers
		double average = sum / numbers.length;
		
		result[0] = average;
		result[1] = min;
		result[2] = max;
		
		return result;
	}
	
	public static void main(String args[]) { 
		RandomNumberGeneration obj = new RandomNumberGeneration();
		
		int nums[] = obj.generate4DigitRandomArray(5);
		double result[] = obj.findAverageMinMax(nums);
		
		// Displaying random numbers with operations
		System.out.println("Average is : " + result[0] + ", min value is " + result[1] + ", max value is " + result[2]);
	}
}