/*
 This program calculates the Body Mass Index (BMI) for a group of people.
 It takes weight and height as input, stores them in arrays,
 computes BMI for each person, determines their weight category,
 and finally displays the result in a tabular format.
*/
package CoreProgramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class BMI { // Main class definition
    public static void main(String[] args) { // Main method where program execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter number of people in a team: "); // Prompts user for team size
        int people = input.nextInt(); // Reads the number of people in the team

        double[] weight = new double[people]; // Array to store weight of each person

        double[] height = new double[people]; // Array to store height of each person

        double[] BMI = new double[people]; // Array to store BMI values for each person

        String[] weightStatus = new String[people]; // Array to store BMI category for each person

        // Loop to take weight and height details for each person
        for (int i = 0; i < people; i++) { // Iterates through each person

            System.out.println("Enter details of person " + (i + 1)); // Displays person number

            System.out.print("Enter weight of each people in the team: "); // Prompts for weight
            weight[i] = input.nextDouble(); // Stores weight value

            System.out.print("Enter height of each people in the team: "); // Prompts for height
            height[i] = input.nextDouble(); // Stores height value
        }

        System.out.println("Weight array: "); // Heading for weight array output

        // Loop to display weight values
        for (int i = 0; i < people; i++) { // Iterates through weight array
            System.out.print(weight[i] + " "); // Prints each weight
        }

        System.out.println("\nHeight array: "); // Heading for height array output

        // Loop to display height values
        for (int i = 0; i < people; i++) { // Iterates through height array
            System.out.print(height[i] + " "); // Prints each height
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < people; i++) { // Iterates through each person

            BMI[i] = weight[i] / (height[i] * height[i]); // Calculates BMI using formula

            // Determines weight category based on BMI value
            if (BMI[i] < 18.5) { // Checks for underweight
                weightStatus[i] = "Underweight"; // Assigns underweight status
            }
            else if (BMI[i] <= 24.9) { // Checks for normal weight
                weightStatus[i] = "Normal weight"; // Assigns normal weight status
            }
            else if (BMI[i] <= 29.9) { // Checks for overweight
                weightStatus[i] = "Overweight"; // Assigns overweight status
            }
            else { // Executes if BMI is above 29.9
                weightStatus[i] = "Obese"; // Assigns obese status
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus"); // Prints table header

        // Loop to display height, weight, BMI, and status in tabular format
        for (int i = 0; i < people; i++) { // Iterates through each person
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    height[i], weight[i], BMI[i], weightStatus[i]); // Prints formatted output
        }
    }
}
