// Writing a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae
import java.util.Scanner;
public class CollinearProgram {
    public static boolean isCollinearBySlope(int x1, int x2, int x3, int y1, int y2, int y3) {
        if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) return false;

        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    public static boolean isCollinearByArea(int x1, int x2, int x3, int y1, int y2, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("\nUsing Slope Formula : " + isCollinearBySlope(x1, x2, x3, y1, x2, y3));
        System.out.println("Using Area Formula : " + isCollinearByArea(x1, x2, x3, y1, x2, y3));
    }
}