package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter year: ");
        int year = input.nextInt();
        // Reading the year from the user

        int length = (int) Math.log10(year) + 1;
        // Calculating the number of digits in the year
        // log10(year) gives (digits - 1), so adding 1

        // Loop to validate the year:
        // Year must be 4 digits and not before 1582 (start of Gregorian calendar)
        while (length != 4 || year < 1582) {
            System.out.println("Please enter a valid year: ");
            year = input.nextInt();
            // Reading year again if invalid

            length = (int) Math.log10(year) + 1;
            // Recalculating digit length after new input
        }

        // Leap year rules:
        // 1. If divisible by 400 → Leap year
        // 2. If divisible by 100 → Not a leap year
        // 3. If divisible by 4 → Leap year
        // 4. Otherwise → Not a leap year
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
}
