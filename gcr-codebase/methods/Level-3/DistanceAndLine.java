import java.util.Scanner;
public class DistanceAndLine {
	
	// Writing a method to find distance
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

	// Writing a method to find line equation
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double result[] = new double[2];
		
		double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
		
		result[0] = m;
		result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
    }
}