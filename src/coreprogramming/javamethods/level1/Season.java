/*
 This program checks whether a given date (month and day)
 falls under the Spring season based on predefined date ranges.
*/
package CoreProgramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Season {

    // Method to check whether the given date falls in Spring season
    public static boolean isSpring(int month, int day) {

        // Checking if month is outside the Spring range (March to June)
        if (month < 3 || month > 6) {
            return false;
        }

        // Checking Spring range for March (March 20 to March 31)
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }

        // Checking Spring range for April (entire month)
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }

        // Checking Spring range for May (entire month)
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }

        // Checking Spring range for June (June 1 to June 20)
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }

        // Returning false if none of the Spring conditions are met
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        // Reading the month value from the user

        System.out.print("Enter day: ");
        int day = sc.nextInt();
        // Reading the day value from the user

        // Checking if the given date falls in Spring season
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
