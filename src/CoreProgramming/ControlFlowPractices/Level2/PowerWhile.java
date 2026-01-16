package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class PowerWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        // Reading the base number

        System.out.print("Enter a power: ");
        int power = scan.nextInt();
        // Reading the exponent value

        // Loop to ensure the base number is positive
        while (number < 0) {
            System.out.print("Enter a positive number: ");
            number = scan.nextInt();
            // Asking again until a valid positive number is entered
        }

        int result = 1;
        // Variable to store the power result
        // Initialized to 1 because multiplication identity is 1

        int counter = 0;
        // Counter variable to control the while loop

        // Loop to calculate number raised to the given power
        while (counter < power) {
            result = number * result;
            // Multiplying number repeatedly
            counter++;
            // Incrementing counter after each multiplication
        }

        System.out.println(result);
        // Printing the final power result
    }
}
