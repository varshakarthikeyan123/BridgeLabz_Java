/*
 This program performs a countdown for a rocket launch.
 It ensures the user enters a valid number (≥ 1),
 then counts down to 1 and finally displays a launch message.
*/
package CoreProgramming.controlflowpractices.level1; // Package for control flow practice programs (Level 1)

import java.util.Scanner; // Scanner class is used to take input from the user

public class CountDown { // Main class
    public static void main(String[] args) { // Program execution starts here

        Scanner input = new Scanner(System.in); // Creating Scanner object

        System.out.print("Enter number: "); // Prompting user
        int number = input.nextInt(); // Reading starting number for countdown

        // Validating input to ensure number is at least 1
        while (number < 1) {
            System.out.print("Enter a number greater than 1: ");
            number = input.nextInt();
        }

        // Countdown loop from the given number to 1
        while (number >= 1) {
            System.out.println("The countdown: " + number);
            number--; // Decrementing the number
        }

        // Final message after countdown
        System.out.println("Launch the rocket");
    }
}
