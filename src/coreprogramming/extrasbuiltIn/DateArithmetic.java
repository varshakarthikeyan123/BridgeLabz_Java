/*
 This program performs date arithmetic operations in Java.
 It takes a date as input and performs multiple operations:
 adding days, adding months, adding years, and subtracting days.
 It also correctly handles month transitions and leap years.
*/
package CoreProgramming.extrasbuiltIn;
// Defines the package for extra built-in utility programs

import java.util.Scanner;
// Imports Scanner class to take input from the user

public class DateArithmetic {
    // Main class for performing date arithmetic

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        // Reading day value

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        // Reading month value

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        // Reading year value

        // Step 1: Add 7 days to the given date
        day += 7;
        // Increasing day by 7

        int[] daysInMonth = getDaysInMonth(year);
        // Getting number of days in each month for the given year

        if (day > daysInMonth[month - 1]) {
            // Checking if day exceeds the current month's limit
            day -= daysInMonth[month - 1];
            // Adjusting day by subtracting current month days
            month++;
            // Moving to the next month
        }

        // Step 2: Add 1 month
        month++;
        // Incrementing month

        if (month > 12) {
            // Checking if month exceeds December
            month = 1;
            // Resetting month to January
            year++;
            // Incrementing year
        }

        // Step 3: Add 2 years
        year += 2;
        // Increasing year by 2

        // Step 4: Subtract 21 days
        day -= 21;
        // Reducing day by 21

        while (day <= 0) {
            // Loop to handle negative or zero day values

            month--;
            // Moving to the previous month

            if (month <= 0) {
                // If month goes before January
                month = 12;
                // Setting month to December
                year--;
                // Moving to previous year
            }

            daysInMonth = getDaysInMonth(year);
            // Updating days in month for the new year

            day += daysInMonth[month - 1];
            // Adding days of the previous month to fix date
        }

        System.out.println("Final date: " + day + "/" + month + "/" + year);
        // Displaying the final calculated date

        scanner.close();
        // Closing Scanner to free resources
    }

    // Method to return number of days in each month for a given year
    public static int[] getDaysInMonth(int year) {

        int[] daysInMonth = {
                31, // January
                28, // February (default)
                31, // March
                30, // April
                31, // May
                30, // June
                31, // July
                31, // August
                30, // September
                31, // October
                30, // November
                31  // December
        };
        // Initializing days for each month

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // Checking leap year condition
            daysInMonth[1] = 29;
            // Updating February days for leap year
        }

        return daysInMonth;
        // Returning the updated days-in-month array
    }
}
