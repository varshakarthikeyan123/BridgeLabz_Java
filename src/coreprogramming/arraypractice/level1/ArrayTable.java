/*
 This program generates a multiplication table for a given number.
 It calculates the products of the number with values from 6 to 9,
 stores the results in an array, and then displays the array elements.
*/
package CoreProgramming.arraypractice.level1; // Defines the package for this program

import java.util.Scanner; // Scanner is used to take input from the user

public class ArrayTable { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read input

        System.out.print("Enter the number for which the multiplication table is needed: ");
        int number = input.nextInt(); // Reading the number for multiplication table

        int[] table = new int[4]; // Declaring an array of size 4 to store results (6 to 9)

        int value = 0; // Variable used as index for the array

        // Loop to calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) { // Iterates from 6 to 9
            table[value] = number * i; // Stores multiplication result in array
            value++; // Moves to next index in the array
        }

        System.out.print("The array with multiplication table from 6 to 9 is: "); // Prints message

        // Loop to display the elements of the array
        for (int i = 0; i <= table.length - 1; i++) { // Iterates through the array
            System.out.print(table[i] + " "); // Prints each element
        }
    }
}
