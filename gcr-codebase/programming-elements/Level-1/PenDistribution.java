// Writing a program to calculate hom many pens were distributed and how many pens were not distributed among students
public class PenDistribution {
	public static void main(String args[]) {
		// Creating variables that will store total Pens and total students
		int totalPens = 14, totalStudents = 3;
		
		// Calculating total distributed and non-distributed pens
		int distributedPensPerStudents = totalPens / totalStudents;
		int nonDistributedPensPerStudents = totalPens - distributedPensPerStudents * totalStudents;
		
		// Displaying total distributed and non-distributed pens among all students
		System.out.println("The Pen Per Student is " + distributedPensPerStudents + " and the remaining pen not distributed is " + nonDistributedPensPerStudents);
	}
}