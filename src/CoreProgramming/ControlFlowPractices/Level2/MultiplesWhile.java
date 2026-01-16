package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class MultiplesWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to validate input:
        // Number should be positive and less than or equal to 100
        while (number > 100 || number < 0) {
            System.out.print("Enter a number less than 100 and should also be positive: ");
            number = input.nextInt();
            // Asking again until valid input is given
        }

        int counter = number - 1;
        // Initializing counter to one less than the given number

        // Loop to check factors of the number using while loop
        while (counter > 1) {

            // Checking if counter divides the number completely
            if (number % counter == 0) {
                System.out.println(counter);
                // Printing the factor
            }

            counter--;
            // Decreasing counter to check the next smaller value
        }
    }
}
