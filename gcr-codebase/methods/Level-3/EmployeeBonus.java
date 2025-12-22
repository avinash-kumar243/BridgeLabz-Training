// Writing a program to find the bonus of 10 employees based on their years of service
public class EmployeeBonus {
	
	// Caluclating the data of all employees
    public static int[][] generateData() {
        int[][] data = new int[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

	// Calculate bonus of all employees salary
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double bonusRate = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;

            result[i][0] = data[i][0];
            result[i][1] = bonus;
            result[i][2] = data[i][0] + bonus;
        }
        return result;
    }

	// Displaying the result
    public static void display(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("Emp\tOldSalary\tBonus\t\tNewSalary");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t\t" + result[i][1] + "\t\t" + result[i][2]);

            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }
        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        double[][] result = calculateBonus(data);
        display(result);
    }
}