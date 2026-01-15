package CoreProgramming.StringFunction.Level3;
import java.util.Scanner;
public class BMI {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (18.5 >= bmi && bmi <= 24.9) {
            status = "Normal";
        } else if (25 >= bmi && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{
                String.format("%.2f", weight),
                String.format("%.2f", heightCm),
                String.format("%.2f", bmi),
                status
        };
    }
    public static String[][] processTeam(double[][] teamData) {
        String[][] result = new String[teamData.length][4];

        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            result[i] = calculateBMI(weight, height);
        }

        return result;
    }
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[1], row[0], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }
        String[][] result = processTeam(teamData);
        displayResults(result);
    }
}

