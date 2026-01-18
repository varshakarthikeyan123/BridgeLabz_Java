/*
 This program finds all the factors of a given number.
 It stores the factors in an array, dynamically increases
 the array size if needed, and finally displays all factors.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for this program

import java.util.Scanner; // Scanner is used to take input from the user

public class FactorArray { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input

        System.out.print("Enter a number: "); // Prompts user to enter a number
        int number = input.nextInt(); // Reads the number whose factors are to be found

        int maxFactor = 10; // Initial size of the array to store factors

        int[] factor = new int[maxFactor]; // Creates an array to store factors

        int index = 0; // Keeps track of the current position in the factor array

        // Loop to find all factors of the number
        for (int i = 1; i <= number; i++) { // Iterates from 1 to the given number

            // Checking if i is a factor of the number
            if (number % i == 0) { // Condition to check divisibility

                // If the array is full, increase its size
                if (index == maxFactor) { // Checks if array capacity is reached

                    int newSize = maxFactor * 2; // Doubles the array size

                    int[] temp = new int[newSize]; // Creates a temporary larger array

                    // Copying old factors into the new array
                    for (int j = 0; j < factor.length; j++) { // Loops through old array
                        temp[j] = factor[j]; // Copies each element to new array
                    }

                    factor = temp; // Assigns the new array back to factor

                    maxFactor = newSize; // Updates the maximum array size
                }

                factor[index] = i; // Stores the factor in the array

                index++; // Moves to the next index position
            }
        }

        System.out.print("The array of factors is: "); // Prints message before displaying factors

        // Loop to display only the stored factors
        for (int i = 0; i < index; i++) { // Iterates through stored factors
            System.out.print(factor[i] + " "); // Prints each factor
        }
    }
}
