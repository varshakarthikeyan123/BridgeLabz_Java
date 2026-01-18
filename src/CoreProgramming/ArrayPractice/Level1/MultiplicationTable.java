/*
 This program creates a multiplication table for a given number.
 It stores the multiplication results from 1 to 10 in an array
 and then displays all the values stored in the array.
*/
package CoreProgramming.ArrayPractice.Level1; // Defines the package for array practice programs (Level 1)

import java.util.Scanner; // Imports Scanner class to take input from the user

public class MultiplicationTable { // Main class definition
    public static void main(String[] args) { // Main method where program execution starts

        Scanner input = new Scanner(System.in); // Creates Scanner object to read user input

        System.out.print("Enter the number for which the multiplication table array is needed: ");
        // Prompts the user to enter a number

        int number = input.nextInt();
        // Reads the number for which the multiplication table is required

        int[] multiplicationResult = new int[10];
        // Declares an integer array of size 10 to store multiplication results (1 to 10)

        // Loop to calculate multiplication table values
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
            // Stores multiplication result in array (i - 1 used because index starts at 0)
        }

        // Loop to display the multiplication table stored in the array
        for (int i = 1; i <= 10; i++) {
            System.out.print(multiplicationResult[i - 1] + " ");
            // Prints each multiplication result from the array
        }
    }
}
