/*
 This program checks whether a given year is a Leap Year.
 It validates the year and then applies leap year rules.
*/
package CoreProgramming.javamethods.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LeapYear {

    // Method to check whether a given year is a leap year
    public static void checkLeapYear(int year) {

        Scanner input = new Scanner(System.in);
        // Scanner used to re-take input if the year is invalid

        int length = (int) Math.log10(year) + 1;
        // Calculating number of digits in the year

        // Loop to ensure the year is a valid 4-digit year and >= 1582
        while (length != 4 || year < 1582) {
            System.out.print("Please enter a valid year: ");
            year = input.nextInt();
            // Re-reading year

            length = (int) Math.log10(year) + 1;
            // Recalculating digit length
        }

        // Leap year rules:
        // 1. Divisible by 400 → Leap year
        // 2. Divisible by 100 → Not a leap year
        // 3. Divisible by 4 → Leap year
        // 4. Otherwise → Not a leap year
        if (year % 400 == 0) {
            System.out.println("Leap year");
        }
        else if (year % 100 == 0) {
            System.out.println("Not a Leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        int year = input.nextInt();
        // Reading the year

        checkLeapYear(year);
        // Calling method to check leap year
    }
}
