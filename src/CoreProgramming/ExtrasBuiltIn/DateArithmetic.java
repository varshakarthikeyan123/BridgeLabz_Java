package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DateArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        // Reading day

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        // Reading month

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        // Reading year

        // Step 1: Add 7 days to the current date
        day += 7;

        // Getting number of days in each month for the given year
        int[] daysInMonth = getDaysInMonth(year);

        // If days exceed the days in the current month, move to next month
        if (day > daysInMonth[month - 1]) {
            day -= daysInMonth[month - 1];
            month++;
        }

        // Step 2: Add 1 month
        month++;
        if (month > 12) {
            month = 1;
            year++;
            // If month exceeds December, reset month and increment year
        }

        // Step 3: Add 2 years
        year += 2;

        // Step 4: Subtract 21 days from the date
        day -= 21;

        // If day becomes zero or negative, adjust month and year accordingly
        while (day <= 0) {
            month--;

            // If month goes below January, move to previous year
            if (month <= 0) {
                month = 12;
                year--;
            }

            // Update days in month based on the new year
            daysInMonth = getDaysInMonth(year);

            // Add days of the previous month to correct the date
            day += daysInMonth[month - 1];
        }

        // Displaying the final calculated date
        System.out.println("Final date: " + day + "/" + month + "/" + year);

        scanner.close();
        // Closing the scanner
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

        // Checking for leap year to update February days
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
            // February has 29 days in a leap year
        }

        return daysInMonth;
        // Returning the updated days-in-month array
    }
}
