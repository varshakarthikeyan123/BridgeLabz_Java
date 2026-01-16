package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class calender {

    // Array storing names of all 12 months
    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Array storing number of days in each month (non-leap year)
    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to check whether a given year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition based on Gregorian calendar rules
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return number of days in a given month of a given year
    public static int getDaysInMonth(int month, int year) {
        // February has 29 days in leap year, otherwise 28
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        // For other months, return value from daysInMonth array
        return daysInMonth[month - 1];
    }

    // Method to return month name based on month number
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to calculate the first day of the month using Zeller’s Congruence
    public static int getFirstDayOfMonth(int month, int year) {

        // Adjust year for January and February
        int y0 = year - (14 - month) / 12;

        // Century-based correction
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Adjusted month value
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate day of the week for the 1st day of the month
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {

        // Print calendar header
        System.out.println("      " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the starting weekday and total days in the month
        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        // Print spaces before the first date
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Input month
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Input year
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);
    }
}
