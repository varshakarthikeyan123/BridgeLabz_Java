/*
 This program prints the multiplication table of a given number
 from 6 to 9 using a for loop.
 It demonstrates basic input handling and loop-based calculation.
*/
package CoreProgramming.controlflowpractices.level1; // Package declaration

import java.util.Scanner; // Scanner class is used to take input from the user

public class MultiplicationTable { // Main class
    public static void main(String[] args) { // Main method starts execution

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Asking user to enter a number

        int number = input.nextInt();
        // Reading the number for which multiplication table is required

        int table = 0;
        // Variable to store multiplication result

        // Loop to generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {

            table = number * i;
            // Calculating multiplication value

            System.out.println(
                    "The multiplication table for the number " + number +
                            " from 6 to 9 is: " + table
            );
            // Displaying the result for each multiplication
        }
    }
}
