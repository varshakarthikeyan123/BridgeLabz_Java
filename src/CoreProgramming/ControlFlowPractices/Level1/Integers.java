package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Integers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading an integer value from the user

        // Checking whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive.");
            // Executed when the number is greater than 0
        }
        else if (number < 0) {
            System.out.println("Negative.");
            // Executed when the number is less than 0
        }
        else {
            System.out.println("Zero.");
            // Executed when the number is exactly 0
        }
    }
}
