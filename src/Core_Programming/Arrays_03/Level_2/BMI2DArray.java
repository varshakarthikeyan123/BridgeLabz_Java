package CoreProgramming.Arrays_03.Level_2;
import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // height, weight, bmi
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " Height=" + personData[i][0] +
                    " Weight=" + personData[i][1] +
                    " BMI=" + personData[i][2] +
                    " Status=" + weightStatus[i]);
        }
    }
}
