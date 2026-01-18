/*
 This program accepts multiple positive numbers from the user
 and stores them in an array until either:
 1) A non-positive number is entered, or
 2) The array reaches its maximum size.
 It then displays all stored elements and their total sum.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for this program

import java.util.Scanner; // Scanner class is used to take input from the user

public class MultipleElements { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        double[] array = new double[10]; // Declaring an array of size 10 to store numbers

        double total = 0.0; // Variable to store the sum of array elements

        int index = 0; // Keeps track of the number of elements stored in the array

        // Infinite loop to continuously take input until a stop condition occurs
        while (true) {

            System.out.print("Enter an number: "); // Prompts user to enter a number
            double number = input.nextDouble(); // Reads a number from the user

            // Stops input if the number is zero or negative
            if (number <= 0) {
                System.out.println("The number should be greater then zero."); // Displays warning
                break; // Exits the loop
            }

            // Stops input if the array reaches its maximum size
            if (index == 10) {
                System.out.println("The array has reached maximum size."); // Displays message
                break; // Exits the loop
            }

            array[index] = number; // Stores the number in the array

            index++; // Moves to the next index position
        }

        System.out.println("The elements of the array are: "); // Prints message before displaying elements

        // Loop to display stored elements and calculate their total
        for (int i = 0; i < index; i++) { // Iterates through stored elements
            System.out.print(array[i] + " "); // Prints each array element
            total = total + array[i]; // Adds each element to total
        }

        System.out.println("\nThe total is: " + total); // Displays the total sum of elements
    }
}
