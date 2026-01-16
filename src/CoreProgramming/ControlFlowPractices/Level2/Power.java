package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Power {
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
        // Variable to store the result of power calculation
        // Initialized to 1 because any number power 0 equals 1

        // Loop to calculate number raised to the given power
        for (int i = 1; i <= power; i++) {
            result = number * result;
            // Multiplying number repeatedly to calculate power
        }

        System.out.println(result);
        // Printing the final power result
    }
}
