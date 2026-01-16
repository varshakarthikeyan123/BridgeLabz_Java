package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Year {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        int year = input.nextInt();
        // Reading the year from the user

        int length = (int) Math.log10(year) + 1;
        // Calculating the number of digits in the year
        // log10(year) gives (digits - 1), so add 1

        // Loop to validate the year:
        // 1. Year must be 4 digits
        // 2. Year must be 1582 or later (start of Gregorian calendar)
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year: ");
            year = input.nextInt();
            // Taking year input again if invalid

            length = (int) Math.log10(year) + 1;
            // Recalculating digit length after new input
        }

        // Leap year condition:
        // 1. Divisible by 4 AND not divisible by 100
        // OR
        // 2. Divisible by 400
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Year is a leap year");
        }
        else {
            System.out.println("Year is not a leap year");
        }
    }
}
