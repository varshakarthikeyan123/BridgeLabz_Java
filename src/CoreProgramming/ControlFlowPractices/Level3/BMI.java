package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Enter weight in kg: ");
        double weight = input.nextDouble();
        // Reading weight in kilograms

        System.out.println("Enter height in cm: ");
        double height = input.nextDouble();
        // Reading height in centimeters

        double heightM = height / 100;
        // Converting height from centimeters to meters

        double bmi = weight / (heightM * heightM);
        // Calculating BMI using the formula:
        // BMI = weight (kg) / (height in meters)^2

        // Checking BMI range and displaying weight category
        if (bmi <= 18.4) {
            System.out.println("Your BMI is " + bmi + " hence you are underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your BMI is " + bmi + " hence you are normal-weight");
        }
        else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("Your BMI is " + bmi + " hence you are overweight");
        }
        else {
            System.out.println("Your BMI is " + bmi + " hence you are obese");
        }
    }
}
