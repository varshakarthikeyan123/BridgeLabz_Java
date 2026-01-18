/*
 This program demonstrates working with 2D arrays in Java.
 It takes user input to create a 2D array, displays it,
 converts the 2D array into a 1D array, and then displays
 the resulting 1D array.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for this program

import java.util.Scanner; // Scanner is used to take input from the user

public class Array2D { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input values

        System.out.print("Enter rows: "); // Prompts user to enter number of rows
        int rows = input.nextInt(); // Reads number of rows for the 2D array

        System.out.print("Enter columns: "); // Prompts user to enter number of columns
        int columns = input.nextInt(); // Reads number of columns for the 2D array

        int[][] arr = new int[rows][columns]; // Declares and creates a 2D array

        int[] array = new int[rows * columns]; // Declares a 1D array to store all 2D elements

        System.out.print("Enter elements of the 2D array: "); // Prompts user to enter elements

        // Loop to take input for each element of the 2D array
        for (int i = 0; i < rows; i++) { // Iterates through rows
            for (int j = 0; j < columns; j++) { // Iterates through columns
                arr[i][j] = input.nextInt(); // Stores user input into 2D array
            }
        }

        System.out.println("The elements of the 2D array is: "); // Prints message before displaying array

        // Loop to display the elements of the 2D array in matrix form
        for (int i = 0; i < rows; i++) { // Iterates through rows
            for (int j = 0; j < columns; j++) { // Iterates through columns
                System.out.print(arr[i][j] + " "); // Prints each element
            }
            System.out.println(); // Moves to next line after each row
        }

        int index = 0; // Index variable for 1D array position

        // Loop to convert 2D array into 1D array
        for (int i = 0; i < rows; i++) { // Iterates through rows
            for (int j = 0; j < columns; j++) { // Iterates through columns
                array[index] = arr[i][j]; // Copies element from 2D to 1D array
                index++; // Increments index for 1D array
            }
        }

        System.out.println("The 1D array is: "); // Prints message before displaying 1D array

        // Loop to display elements of the 1D array
        for (int i = 0; i < rows * columns; i++) { // Iterates through 1D array
            System.out.print(array[i] + " "); // Prints each element of 1D array
        }
    }
}
