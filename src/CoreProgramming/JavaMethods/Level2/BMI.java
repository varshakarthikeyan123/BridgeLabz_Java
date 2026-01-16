package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI {

    // Method to calculate BMI for each person and store it in the 2D array
    public static void calculateBMI(double[][] data) {

        // Loop through each person's data
        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            // Weight in kilograms

            double heightCm = data[i][1];
            // Height in centimeters

            double heightM = heightCm / 100;
            // Converting height from centimeters to meters

            double bmi = weight / (heightM * heightM);
            // Calculating BMI using the formula

            data[i][2] = bmi;
            // Storing BMI value in the third column
        }
    }

    // Method to determine BMI status based on calculated BMI values
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];
        // Array to store BMI status for each person

        // Loop through BMI values to assign status
        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];
            // Fetching BMI value

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmi <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        return status;
        // Returning BMI status array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        double[][] persons = new double[10][3];
        // 2D array to store weight, height, and BMI for 10 persons

        // Loop to take input for each person
        for (int i = 0; i < persons.length; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            persons[i][0] = input.nextDouble();
            // Storing weight

            System.out.print("Enter height (cm): ");
            persons[i][1] = input.nextDouble();
            // Storing height
        }

        calculateBMI(persons);
        // Calling method to calculate BMI

        String[] status = getBMIStatus(persons);
        // Getting BMI status for each person

        // Displaying the final result in tabular format
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    persons[i][1],
                    persons[i][0],
                    persons[i][2],
                    status[i]);
        }
    }
}
