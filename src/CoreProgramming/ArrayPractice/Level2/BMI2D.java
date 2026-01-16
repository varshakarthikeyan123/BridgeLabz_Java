package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();
        // Reading the number of persons

        double[][] personData = new double[number][3];
        // 2D array to store person data
        // Column 0 → Weight
        // Column 1 → Height
        // Column 2 → BMI

        String[] weightStatus = new String[number];
        // Array to store BMI category for each person

        // Loop to take weight and height for each person
        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for person " + (i + 1));

            // Loop to validate weight input
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = input.nextDouble();

                // Weight must be a positive value
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Invalid weight! Enter a positive value.");
            }

            // Loop to validate height input
            while (true) {
                System.out.print("Enter height (meters): ");
                personData[i][1] = input.nextDouble();

                // Height must be a positive value
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Invalid height! Enter a positive value.");
            }
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            // Extracting weight

            double height = personData[i][1];
            // Extracting height

            personData[i][2] = weight / (height * height);
            // Calculating BMI using formula: weight / (height²)

            // Determining BMI category
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            }
            else if (personData[i][2] <= 29.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");

        // Loop to display the final result in tabular format
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][1],  // Height
                    personData[i][0],  // Weight
                    personData[i][2],  // BMI
                    weightStatus[i]);  // BMI Category
        }

        input.close();
        // Closing Scanner to release resources
    }
}
