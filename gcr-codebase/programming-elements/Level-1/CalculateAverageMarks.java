// Writing a java program to calculate average marks in math, physics, and chemistry 
public class CalculateAverageMarks {
	public static void main(String args[]) {		
		// Providing marks of each subject 
		int mathMarks = 94, physicsMarks = 95, chemistryMarks = 97; 
		
		// Calculating average marks 
		double averageMarks = (mathMarks + physicsMarks + chemistryMarks) / 3.0;
		
		// Displaying average marks in math, physics, and chemistry
		System.out.println("Average marks in math, physics, and chemistry is : " + averageMarks);
	}
}