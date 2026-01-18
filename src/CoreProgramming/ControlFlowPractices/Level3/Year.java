/*
 This program checks whether a given year is a leap year.
 It validates the input to ensure the year is a 4-digit number
 and is not earlier than 1582 (start of the Gregorian calendar).
 Based on leap year rules, it prints whether the year is a leap year or not.
*/
package CoreProgramming.ControlFlowPractices.Level3;
// Defines the package for Level 3 control flow practice programs

import java.util.Scanner;
// Imports Scanner class to take input from the user

public class Year {
    // Main class declaration

    public static void main(String[] args) {
        // Main method where execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        // Prompting the user to enter a year

        int year = input.nextInt();
        // Reading the year from the user

        int length = (int) Math.log10(year) + 1;
        // Calculating number of digits in the year

        // Loop to validate the entered year
        while (length != 4 || year < 1582) {
            // Condition checks for 4-digit year and Gregorian calendar validity

            System.out.println("Please enter a valid year: ");
            // Asking the user to re-enter a valid year

            year = input.nextInt();
            // Reading year again

            length = (int) Math.log10(year) + 1;
            // Recalculating digit length after new input
        }

        // Checking leap year condition
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // Leap year rule check

            System.out.println("Year is a leap year");
            // Printing leap year message
        }
        else {
            System.out.println("Year is not a leap year");
            // Printing non-leap year message
        }
    }
}
