/*
 This program displays a calendar for a given month and year
 using Zeller’s Congruence to calculate the first day of the month.
*/

package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Month names
    static String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // Days in each month (non-leap year)
    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month - 1];
    }

    // Method to get month name
    public static String getMonthName(int month) {
        return months[month - 1];
    }

    // Method to calculate first day of the month (Zeller’s Congruence)
    public static int getFirstDayOfMonth(int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to display calendar
    public static void displayCalendar(int month, int year) {

        System.out.println("\n      " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        // Validate month
        while (month < 1 || month > 12) {
            System.out.print("Invalid month. Enter again (1-12): ");
            month = input.nextInt();
        }

        System.out.print("Enter year: ");
        int year = input.nextInt();

        displayCalendar(month, year);

        input.close();
    }
}
