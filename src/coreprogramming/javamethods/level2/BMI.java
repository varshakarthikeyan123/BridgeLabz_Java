/*
 This program calculates the Body Mass Index (BMI) for multiple people.
 It stores weight, height, and BMI in a 2D array, calculates BMI using a method,
 determines BMI category using another method, and finally displays the results
 in a tabular format.
*/
package coreprogramming.javamethods.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI {

    // Method to calculate BMI for each person and store it in the 2D array
    public static void calculateBMI(double[][] data) {

        // Loop through each person's data
        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            // Fetching weight in kilograms from the array

            double heightCm = data[i][1];
            // Fetching height in centimeters from the array

            double heightM = heightCm / 100;
            // Converting height from centimeters to meters

            double bmi = weight / (heightM * heightM);
            // Calculating BMI using the formula weight / (height in meters)^2

            data[i][2] = bmi;
            // Storing calculated BMI in the third column of the array
        }
    }

    // Method to determine BMI status based on calculated BMI values
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];
        // Array to store BMI category for each person

        // Loop through BMI values to assign appropriate status
        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];
            // Retrieving BMI value from the array

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
        // Returning the BMI status array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        double[][] persons = new double[10][3];
        // 2D array to store weight, height, and BMI for 10 persons

        // Loop to take input for each person
        for (int i = 0; i < persons.length; i++) {

            System.out.println("Person " + (i + 1));
            // Displaying person number

            System.out.print("Enter weight (kg): ");
            persons[i][0] = input.nextDouble();
            // Storing weight value in array

            System.out.print("Enter height (cm): ");
            persons[i][1] = input.nextDouble();
            // Storing height value in array
        }

        calculateBMI(persons);
        // Calling method to calculate BMI for all persons

        String[] status = getBMIStatus(persons);
        // Calling method to get BMI status for each person

        // Displaying the final BMI report in tabular format
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    persons[i][1],
                    persons[i][0],
                    persons[i][2],
                    status[i]);
            // Printing height, weight, BMI, and status for each person
        }
    }
}
