package CoreProgramming.JavaMethods.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LeapYear {

    // Method to check whether a given year is a leap year
    public static void leapYear(int year) {

        Scanner input = new Scanner(System.in);
        // Scanner used here to re-take input if year is invalid

        int length = (int) Math.log10(year) + 1;
        // Calculating number of digits in the year

        // Loop to ensure year is a valid 4-digit year and >= 1582
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year: ");
            year = input.nextInt();
            length = (int) Math.log10(year) + 1;
        }

        // Leap year rule:
        // Divisible by 400 OR divisible by 4 but not by 100
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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        int year = input.nextInt();
        // Reading year input

        leapYear(year);
        // Calling method to check leap year
    }
}
