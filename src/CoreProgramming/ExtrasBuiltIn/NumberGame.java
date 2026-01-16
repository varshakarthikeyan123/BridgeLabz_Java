package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when you're ready: ");
        scanner.nextLine();
        // Waiting for the user to press Enter before starting the game

        int low = 1;
        // Lower bound of the guessing range

        int high = 100;
        // Upper bound of the guessing range

        boolean correct = false;
        // Flag to track whether the correct number is guessed

        // Loop continues until the correct number is found or range becomes invalid
        while (!correct && low <= high) {

            int guess = (low + high) / 2;
            // Computer makes a guess using binary search logic

            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            String feedback = scanner.nextLine().toLowerCase();
            // Reading user feedback and converting it to lowercase

            // Adjusting search range based on user feedback
            switch (feedback) {

                case "high":
                    high = guess - 1;
                    // If guess is too high, reduce the upper limit
                    break;

                case "low":
                    low = guess + 1;
                    // If guess is too low, increase the lower limit
                    break;

                case "correct":
                    System.out.println("Yay! I guessed your number " + guess + "!");
                    correct = true;
                    // Setting flag to true when the correct number is guessed
                    break;

                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
                    // Handling invalid user input
            }
        }

        // This message appears if the loop ends without correct feedback
        if (!correct) {
            System.out.println("Please provide proper feedback");
        }
    }
}
