/*
 This program checks whether a given year is a Leap Year.
 It validates the input year to ensure it is a 4-digit year
 and follows the Gregorian calendar rules (year ≥ 1582).
 Then it applies leap year conditions to determine the result.
*/
package CoreProgramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LeapYear {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        int year = input.nextInt();
        // Reading the year from the user

        int length = (int) Math.log10(year) + 1;
        // Calculating number of digits in the year
        // log10(year) gives digits − 1, so add 1

        // Loop to validate the year
        // Year must be a 4-digit number and ≥ 1582
        while (length != 4 || year < 1582) {

            System.out.print("Please enter a valid year: ");
            year = input.nextInt();
            // Taking year input again if invalid

            length = (int) Math.log10(year) + 1;
            // Recalculating digit length for the new year
        }

        // Leap year rules:
        // Divisible by 400 → Leap year
        // Divisible by 100 → Not a leap year
        // Divisible by 4 → Leap year
        // Otherwise → Not a leap year
        if (year % 400 == 0) {
            System.out.println("Leap year");
        }
        else if (year % 100 == 0) {
            System.out.println("Not Leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }
}
