/*
 This program checks whether a given date falls in the Spring season.
 Spring is considered from March 20 to June 20.
 The program takes month and day as input, uses a method to validate
 the season, and prints the result.
*/
package CoreProgramming.ControlFlowPractices.Level1;
// Package declaration for control flow practice programs

import java.util.Scanner;
// Imports Scanner class to take input from the user

public class Season {
    // Main class named Season

    // Method to check whether the given date falls in Spring season
    public static boolean isSpring(int month, int day) {

        // If month is before March or after June, it cannot be Spring
        if (month < 3 || month > 6) {
            return false;
            // Returns false if month is outside Spring range
        }

        // Checking Spring dates in March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
            // Returns true if date is between March 20 and March 31
        }

        // Checking Spring dates in April
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
            // Returns true for any valid day in April
        }

        // Checking Spring dates in May
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
            // Returns true for any valid day in May
        }

        // Checking Spring dates in June
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
            // Returns true if date is between June 1 and June 20
        }

        // If none of the Spring conditions match
        return false;
        // Returns false indicating not a Spring date
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter month (1-12): ");
        // Prompting user to enter the month
        int month = sc.nextInt();
        // Reading month value

        System.out.print("Enter day: ");
        // Prompting user to enter the day
        int day = sc.nextInt();
        // Reading day value

        // Checking if the entered date falls in Spring season
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
            // Printed if the date is in Spring
        } else {
            System.out.println("Not a Spring Season");
            // Printed if the date is not in Spring
        }
    }
}
