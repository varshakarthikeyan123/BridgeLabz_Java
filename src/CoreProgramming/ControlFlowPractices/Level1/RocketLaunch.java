package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class RocketLaunch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the starting number for the countdown

        // Loop to ensure the entered number is greater than or equal to 1
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        // for loop to perform countdown from the given number to 1
        for (int i = number; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            // Printing each countdown number
        }

        System.out.println("Launch the rocket");
        // Message displayed after countdown completes
    }
}
