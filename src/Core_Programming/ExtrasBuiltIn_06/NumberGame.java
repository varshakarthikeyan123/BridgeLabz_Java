package CoreProgramming.ExtrasBuiltIn;
import  java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when you're ready: ");
        scanner.nextLine();

        int low = 1;
        int high = 100;
        boolean correct = false;

        while (!correct && low <= high) {
            int guess = (low + high) / 2; // Binary search guess
            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            String feedback = scanner.nextLine().toLowerCase();

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number " + guess + "!");
                    correct = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Please provide proper feedback");
        }
    }
}

