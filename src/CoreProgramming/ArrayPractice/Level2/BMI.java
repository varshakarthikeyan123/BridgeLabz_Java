package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of people in a team: ");
        int people = input.nextInt();
        // Reading the number of people in the team

        double[] weight = new double[people];
        // Array to store weight of each person

        double[] height = new double[people];
        // Array to store height of each person

        double[] BMI = new double[people];
        // Array to store BMI values for each person

        String[] weightStatus = new String[people];
        // Array to store weight category based on BMI

        // Loop to take weight and height details for each person
        for (int i = 0; i < people; i++) {

            System.out.println("Enter details of person " + (i + 1));

            System.out.print("Enter weight of each people in the team: ");
            weight[i] = input.nextDouble();
            // Storing weight input

            System.out.print("Enter height of each people in the team: ");
            height[i] = input.nextDouble();
            // Storing height input
        }

        System.out.println("Weight array: ");

        // Loop to display weight values
        for (int i = 0; i < people; i++) {
            System.out.print(weight[i] + " ");
        }

        System.out.println("\nHeight array: ");

        // Loop to display height values
        for (int i = 0; i < people; i++) {
            System.out.print(height[i] + " ");
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < people; i++) {

            BMI[i] = weight[i] / (height[i] * height[i]);
            // BMI formula: weight / (height * height)

            // Determining weight category based on BMI value
            if (BMI[i] < 18.5) {
                weightStatus[i] = "Underweight";
            }
            else if (BMI[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            }
            else if (BMI[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");

        // Loop to display height, weight, BMI, and status in tabular format
        for (int i = 0; i < people; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    height[i], weight[i], BMI[i], weightStatus[i]);
        }
    }
}
