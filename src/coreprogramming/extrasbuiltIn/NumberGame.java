/*
 This program is a simple Number Guessing Game.
 The computer guesses a number using binary search logic,
 and the user guides it by giving feedback.
*/
package CoreProgramming.extrasbuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when you're ready:");
        scanner.nextLine();
        // Waiting for user to start the game

        int low = 1;
        // Lower bound of guessing range

        int high = 100;
        // Upper bound of guessing range

        boolean correct = false;
        // Flag to track if the correct number is guessed

        // Loop continues until the correct number is found
        while (!correct && low <= high) {

            int guess = (low + high) / 2;
            // Computer guesses the middle number (binary search)

            System.out.print("Is your number " + guess + "? (high / low / correct): ");
            String feedback = scanner.nextLine().toLowerCase();
            // Reading user feedback

            switch (feedback) {

                case "high":
                    high = guess - 1;
                    // Guess is too high
                    break;

                case "low":
                    low = guess + 1;
                    // Guess is too low
                    break;

                case "correct":
                    System.out.println("Yay! I guessed your number " + guess + "!");
                    correct = true;
                    // Correct guess found
                    break;

                default:
                    System.out.println("Invalid input. Please type high, low, or correct.");
                    // Handling invalid input
            }
        }

        // If loop ends without a correct answer
        if (!correct) {
            System.out.println("Please provide proper feedback.");
        }

        scanner.close();
        // Closing scanner
    }
}
