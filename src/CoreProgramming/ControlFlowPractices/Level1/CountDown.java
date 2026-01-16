package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class CountDown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the starting number for countdown

        // Loop to validate input and ensure number is greater than or equal to 1
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        // Loop to perform countdown from the entered number to 1
        while (number >= 1) {
            System.out.println("The countdown: " + number);
            number--;
            // Decreasing the number by 1 in each iteration
        }

        System.out.println("Launch the rocket");
        // Message displayed after countdown completes
    }
}
