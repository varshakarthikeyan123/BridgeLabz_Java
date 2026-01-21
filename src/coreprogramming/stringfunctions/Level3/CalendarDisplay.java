/*
 This program displays a calendar for a given month and year.
 It determines the month name, checks for leap years,
 calculates the number of days in the month,
 finds the first day of the month,
 and prints the calendar in a formatted layout.
 The program demonstrates arrays, mathematical logic,
 conditional statements, and formatted output in Java.
*/

package CoreProgramming.stringfunctions.Level3;

import java.util.Scanner; // imports Scanner class to take input from the user

public class CalendarDisplay {

    public static String getMonthName(int month) {

        // array storing names of all months
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        return months[month - 1]; // returns month name based on month number
    }

    public static boolean isLeapYear(int year) {

        // checks leap year rules
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    public static int getDaysInMonth(int month, int year) {

        // array storing number of days in each month
        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        // adjusts February days for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1]; // returns number of days in the given month
    }

    public static int getFirstDay(int month, int year) {

        int d = 1; // day of the month
        int y = year;
        int m = month;

        // Zeller’s Congruence formula to find first day of the month
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // returns day index (0 = Sunday)
    }

    public static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month); // gets month name
        int daysInMonth = getDaysInMonth(month, year); // gets total days
        int firstDay = getFirstDay(month, year); // gets first day of month

        System.out.println("\n      " + monthName + " " + year); // prints calendar title
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); // prints week headers

        // prints spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.printf("%3s", "");
        }

        // prints all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);

            // moves to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // prints final newline
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter month (1-12): "); // prompts user for month
        int month = sc.nextInt(); // reads month value

        System.out.print("Enter year: "); // prompts user for year
        int year = sc.nextInt(); // reads year value

        displayCalendar(month, year); // displays calendar for given month and year
    }
}
