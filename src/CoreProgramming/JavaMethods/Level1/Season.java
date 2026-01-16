package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Season {

    // Method to check whether the given date falls in Spring season
    public static boolean isSpring(int month, int day) {

        // Spring months are from March (3) to June (6)
        if (month < 3 || month > 6) {
            return false;
        }

        // Spring starts from March 20 to March 31
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }

        // Entire month of April is Spring
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }

        // Entire month of May is Spring
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }

        // Spring ends on June 20
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }

        // All other dates are not Spring
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        // Reading month input

        System.out.print("Enter day: ");
        int day = sc.nextInt();
        // Reading day input

        // Checking season using isSpring method
        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
