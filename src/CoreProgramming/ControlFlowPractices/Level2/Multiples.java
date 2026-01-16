package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to ensure the number entered is less than or equal to 100
        while (number > 100) {
            System.out.print("Enter a number less than 100: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        // Loop to check numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {

            // Checking if 'i' divides the given number completely
            if (number % i == 0) {
                System.out.println(i);
                // Printing the divisor of the given number
            }
        }
    }
}
