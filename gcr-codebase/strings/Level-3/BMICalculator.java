import java.util.Scanner;
public class BMICalculator {

    // Method 1: Calculate BMI and Status for a single person
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {
        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // BMI formula
        double bmi = weightKg / (heightM * heightM);

        String status;

        if(bmi <= 18.4) {
            status = "Underweight";
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if(bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.format("%.2f", bmi),
            status
        };
    }

    // Method 2: Create BMI report for all persons
    public static String[][] generateBMIReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for(int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            report[i][0] = String.valueOf(height);        // Height
            report[i][1] = String.valueOf(weight);        // Weight
            report[i][2] = bmiResult[0];                  // BMI
            report[i][3] = bmiResult[1];                  // Status
        }
        return report;
    }

    // Method 3: Display result in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-------------------------------------------------------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" +
                               arr[i][1] + "\t\t" +
                               arr[i][2] + "\t\t" +
                               arr[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int persons = 10;
        double[][] inputData = new double[persons][2];

        // Taking user input
        for(int i = 0; i < persons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            inputData[i][1] = sc.nextDouble();
        }
        String[][] bmiReport = generateBMIReport(inputData);
        displayTable(bmiReport);
    }
}