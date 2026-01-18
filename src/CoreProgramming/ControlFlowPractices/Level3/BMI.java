/*
 This program calculates the Body Mass Index (BMI) of a person.
 It takes weight and height as input, converts height to meters,
 computes BMI using the standard formula, and classifies the
 person into a weight category based on BMI ranges.
*/
package CoreProgramming.ControlFlowPractices.Level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();
        // Reading the weight of the person in kilograms

        System.out.println("Enter height in cm: ");
        double height = input.nextDouble();
        // Reading the height of the person in centimeters

        double heightM = height / 100;
        // Converting height from centimeters to meters

        double bmi = weight / (heightM * heightM);
        // Calculating BMI using the formula:
        // BMI = weight / (height in meters × height in meters)

        // Checking BMI range to determine weight category
        if (bmi <= 18.4) {
            System.out.println("Your BMI is " + bmi + " hence you are underweight");
            // Condition for underweight category
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is " + bmi + " hence you are normal-weight");
            // Condition for normal weight category
        }
        else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Your BMI is " + bmi + " hence you are overweight");
            // Condition for overweight category
        }
        else {
            System.out.println("Your BMI is " + bmi + " hence you are obese");
            // Condition for obese category
        }
    }
}
