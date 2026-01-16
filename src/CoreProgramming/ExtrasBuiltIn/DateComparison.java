package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DateComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Enter first date:");

        int day1 = getInput(scanner, "Day: ");
        // Reading day of first date

        int month1 = getInput(scanner, "Month: ");
        // Reading month of first date

        int year1 = getInput(scanner, "Year: ");
        // Reading year of first date

        System.out.println("Enter second date:");

        int day2 = getInput(scanner, "Day: ");
        // Reading day of second date

        int month2 = getInput(scanner, "Month: ");
        // Reading month of second date

        int year2 = getInput(scanner, "Year: ");
        // Reading year of second date

        int result = compareDates(day1, month1, year1, day2, month2, year2);
        // Calling method to compare the two dates

        // Interpreting the comparison result
        if (result < 0) {
            System.out.println("The first date is before the second date.");
        }
        else if (result > 0) {
            System.out.println("The first date is after the second date.");
        }
        else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
        // Closing the scanner
    }

    // Method to display a prompt and read integer input
    public static int getInput(Scanner scanner, String prompt) {

        System.out.print(prompt);
        // Displaying input prompt

        return scanner.nextInt();
        // Returning the entered value
    }

    // Method to compare two dates
    // Returns:
    // -1 if first date is earlier
    //  1 if first date is later
    //  0 if both dates are equal
    public static int compareDates(int day1, int month1, int year1,
                                   int day2, int month2, int year2) {

        // First compare years
        if (year1 != year2) {
            return (year1 < year2) ? -1 : 1;
        }
        // If years are same, compare months
        else if (month1 != month2) {
            return (month1 < month2) ? -1 : 1;
        }
        // If months are same, compare days
        else if (day1 != day2) {
            return (day1 < day2) ? -1 : 1;
        }
        // If day, month, and year are all equal
        else {
            return 0;
        }
    }
}
