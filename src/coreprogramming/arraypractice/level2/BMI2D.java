/*
 This program calculates BMI using a 2D array.
 It stores weight, height, and BMI for multiple persons,
 validates input values, determines BMI category,
 and displays the result in a tabular format.
*/
package coreprogramming.arraypractice.level2; // Package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class BMI2D { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter number of persons: "); // Prompts user for number of persons
        int number = input.nextInt(); // Reads the number of persons

        double[][] personData = new double[number][3]; // 2D array to store weight, height, and BMI
        // Index [i][0] -> weight, [i][1] -> height, [i][2] -> BMI

        String[] weightStatus = new String[number]; // Array to store BMI category for each person

        // Loop to take weight and height input for each person
        for (int i = 0; i < number; i++) { // Iterates through each person

            System.out.println("\nEnter details for person " + (i + 1)); // Displays person number

            // Loop to validate weight input
            while (true) { // Repeats until valid weight is entered
                System.out.print("Enter weight (kg): "); // Prompts for weight
                personData[i][0] = input.nextDouble(); // Stores weight value

                if (personData[i][0] > 0) { // Checks if weight is positive
                    break; // Exits loop if valid
                }
                System.out.println("Invalid weight! Enter a positive value."); // Error message
            }

            // Loop to validate height input
            while (true) { // Repeats until valid height is entered
                System.out.print("Enter height (meters): "); // Prompts for height
                personData[i][1] = input.nextDouble(); // Stores height value

                if (personData[i][1] > 0) { // Checks if height is positive
                    break; // Exits loop if valid
                }
                System.out.println("Invalid height! Enter a positive value."); // Error message
            }
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < number; i++) { // Iterates through each person

            double weight = personData[i][0]; // Retrieves weight value
            double height = personData[i][1]; // Retrieves height value

            personData[i][2] = weight / (height * height); // Calculates BMI

            // Determines BMI category
            if (personData[i][2] < 18.5) { // Checks underweight range
                weightStatus[i] = "Underweight"; // Assigns category
            }
            else if (personData[i][2] <= 24.9) { // Checks normal range
                weightStatus[i] = "Normal weight"; // Assigns category
            }
            else if (personData[i][2] <= 29.9) { // Checks overweight range
                weightStatus[i] = "Overweight"; // Assigns category
            }
            else { // Executes if BMI is above 29.9
                weightStatus[i] = "Obese"; // Assigns obese category
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\t\tStatus"); // Prints table header

        // Loop to display final BMI report
        for (int i = 0; i < number; i++) { // Iterates through each person
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    personData[i][1], // Displays height
                    personData[i][0], // Displays weight
                    personData[i][2], // Displays BMI
                    weightStatus[i]); // Displays BMI category
        }

        input.close(); // Closes Scanner to release resources
    }
}
