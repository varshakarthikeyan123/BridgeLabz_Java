/*
 This program compares two dates entered by the user.
 It reads day, month, and year for two different dates
 and determines whether the first date is before,
 after, or equal to the second date.
*/
package coreprogramming.extrasbuiltIn;
// Defines the package for extra built-in utility programs

import java.util.Scanner;
// Imports Scanner class to take input from the user

public class DateComparison {
    // Main class used for comparing two dates

    public static void main(String[] args) {
        // Main method where program execution begins

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Enter first date:");
        // Prompt for first date input

        int day1 = getInput(scanner, "Day: ");
        // Reading day of the first date

        int month1 = getInput(scanner, "Month: ");
        // Reading month of the first date

        int year1 = getInput(scanner, "Year: ");
        // Reading year of the first date

        System.out.println("Enter second date:");
        // Prompt for second date input

        int day2 = getInput(scanner, "Day: ");
        // Reading day of the second date

        int month2 = getInput(scanner, "Month: ");
        // Reading month of the second date

        int year2 = getInput(scanner, "Year: ");
        // Reading year of the second date

        int result = compareDates(day1, month1, year1, day2, month2, year2);
        // Comparing the two dates using the compareDates method

        if (result < 0) {
            // If result is negative, first date is earlier
            System.out.println("The first date is before the second date.");
        }
        else if (result > 0) {
            // If result is positive, first date is later
            System.out.println("The first date is after the second date.");
        }
        else {
            // If result is zero, both dates are equal
            System.out.println("Both dates are the same.");
        }

        scanner.close();
        // Closing Scanner to release system resources
    }

    // Method to display a prompt and read integer input
    public static int getInput(Scanner scanner, String prompt) {

        System.out.print(prompt);
        // Displaying the input prompt

        return scanner.nextInt();
        // Reading and returning the entered integer value
    }

    // Method to compare two dates
    // Returns:
    // -1 if first date is earlier
    //  1 if first date is later
    //  0 if both dates are equal
    public static int compareDates(int day1, int month1, int year1,
                                   int day2, int month2, int year2) {

        if (year1 != year2) {
            // Comparing years first
            return (year1 < year2) ? -1 : 1;
        }
        else if (month1 != month2) {
            // Comparing months if years are equal
            return (month1 < month2) ? -1 : 1;
        }
        else if (day1 != day2) {
            // Comparing days if months are equal
            return (day1 < day2) ? -1 : 1;
        }
        else {
            // All values are equal
            return 0;
        }
    }
}
