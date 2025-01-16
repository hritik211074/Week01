import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double[][] heightWeightArray = new double[10][2];
        Scanner scanner = new Scanner(System.in);

        // Take user input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiStatusArray = calculateBMIStatus(heightWeightArray);

        // Display the result
        displayBMIStatus(bmiStatusArray);
    }

    // Method to calculate BMI and Status
    public static String[][] calculateBMIStatus(double[][] heightWeightArray) {
        String[][] bmiStatusArray = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
			
            double height = heightWeightArray[i][1] / 100; // Convert cm to meters
			
            double bmi = weight / (height * height);
			
            String status = getStatus(bmi);

            bmiStatusArray[i][0] = String.format("%.2f", heightWeightArray[i][1]); // Height in cm
            bmiStatusArray[i][1] = String.format("%.2f", weight); // Weight in kg
            bmiStatusArray[i][2] = String.format("%.2f", bmi); // BMI
            bmiStatusArray[i][3] = status; // Status
        }
        return bmiStatusArray;
    }

    // Method to determine BMI Status
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";  // Underweight condition
		
        else if (bmi < 24.9) return "Normal weight";  //Normalweight condition
		
        else if (bmi < 29.9) return "Overweight";   // Overweight condition
		
        else return "Obese";
    }

    // Method to display BMI Status
    public static void displayBMIStatus(String[][] bmiStatusArray) {
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s%n", bmiStatusArray[i][0], bmiStatusArray[i][1], bmiStatusArray[i][2], bmiStatusArray[i][3]);
        }
    }
}
