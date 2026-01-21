/*
 This program calculates the Body Mass Index (BMI)
 for multiple people and determines their health status.
 It takes weight (in kg) and height (in cm) as input,
 converts height to meters, calculates BMI,
 categorizes the result, and displays a formatted table.
 The program demonstrates method decomposition,
 arrays (1D and 2D), conditional logic,
 numeric formatting, and formatted output in Java.
*/

package coreprogramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class BMI {

    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100; // converts height from cm to meters
        double bmi = weight / (heightM * heightM); // calculates BMI value
        String status; // stores BMI category

        // determines BMI category based on BMI value
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // returns formatted values as a string array
        return new String[]{
                String.format("%.2f", weight),   // formatted weight
                String.format("%.2f", heightCm), // formatted height
                String.format("%.2f", bmi),      // formatted BMI
                status                            // BMI status
        };
    }

    public static String[][] processTeam(double[][] teamData) {

        String[][] result = new String[teamData.length][4]; // stores BMI details for all people

        // processes BMI calculation for each person
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0]; // extracts weight
            double height = teamData[i][1]; // extracts height
            result[i] = calculateBMI(weight, height); // calculates BMI details
        }

        return result; // returns processed BMI data
    }

    public static void displayResults(String[][] data) {

        // prints table header with formatting
        System.out.printf(
                "%-10s %-10s %-10s %-15s%n",
                "Height(cm)", "Weight(kg)", "BMI", "Status"
        );

        // prints each person's BMI details
        for (String[] row : data) {
            System.out.printf(
                    "%-10s %-10s %-10s %-15s%n",
                    row[1], row[0], row[2], row[3]
            );
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        double[][] teamData = new double[10][2]; // stores weight and height for 10 people

        // collects input data for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");

            System.out.print("Weight (kg): "); // prompts for weight
            teamData[i][0] = sc.nextDouble(); // reads weight

            System.out.print("Height (cm): "); // prompts for height
            teamData[i][1] = sc.nextDouble(); // reads height
        }

        String[][] result = processTeam(teamData); // processes BMI for all people
        displayResults(result); // displays final BMI table
    }
}
