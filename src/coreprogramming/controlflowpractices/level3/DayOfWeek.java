/*
 This program calculates the day of the week for a given date
 using the Gregorian calendar formula.
 It takes date, month, and year as input,
 computes adjusted values, and displays
 the corresponding day and month names.
*/
package coreprogramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DayOfWeek {
    // Main class definition

    public static void main(String[] args) {
        // Main method where execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter date: ");
        int d = input.nextInt();
        // Reading the day of the month

        System.out.print("Enter month: ");
        int m = input.nextInt();
        // Reading the month number

        System.out.print("Enter year: ");
        int y = input.nextInt();
        // Reading the year

        int y0 = y - (14 - m) / 12;
        // Adjusting the year value based on the month

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Calculating leap year correction factor

        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Adjusting month value to match Gregorian formula

        int d0 = (d + x + (31 * m0) / 12) % 7;
        // Calculating day of the week (0–6)

        System.out.println("Day of week according to Gregorian calendar: " + d0);
        // Printing numeric day value

        System.out.println("Month according to Gregorian calendar: " + m0);
        // Printing adjusted month value

        System.out.println("Year according to Gregorian calendar: " + y0);
        // Printing adjusted year value

        // Switch case to print month name
        switch (m0) {
            case 1:  System.out.println("The Gregorian calendar month is: January"); break;
            case 2:  System.out.println("The Gregorian calendar month is: February"); break;
            case 3:  System.out.println("The Gregorian calendar month is: March"); break;
            case 4:  System.out.println("The Gregorian calendar month is: April"); break;
            case 5:  System.out.println("The Gregorian calendar month is: May"); break;
            case 6:  System.out.println("The Gregorian calendar month is: June"); break;
            case 7:  System.out.println("The Gregorian calendar month is: July"); break;
            case 8:  System.out.println("The Gregorian calendar month is: August"); break;
            case 9:  System.out.println("The Gregorian calendar month is: September"); break;
            case 10: System.out.println("The Gregorian calendar month is: October"); break;
            case 11: System.out.println("The Gregorian calendar month is: November"); break;
            case 12: System.out.println("The Gregorian calendar month is: December"); break;
        }

        // Switch case to print day name
        switch (d0) {
            case 0: System.out.println("The Gregorian calendar date is: Sunday"); break;
            case 1: System.out.println("The Gregorian calendar date is: Monday"); break;
            case 2: System.out.println("The Gregorian calendar date is: Tuesday"); break;
            case 3: System.out.println("The Gregorian calendar date is: Wednesday"); break;
            case 4: System.out.println("The Gregorian calendar date is: Thursday"); break;
            case 5: System.out.println("The Gregorian calendar date is: Friday"); break;
            case 6: System.out.println("The Gregorian calendar date is: Saturday"); break;
        }
    }
}
