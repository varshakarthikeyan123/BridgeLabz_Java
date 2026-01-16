package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to ensure the number is positive and non-zero
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        int factorial = 1;
        // Variable to store factorial result (initialized to 1)

        int i = 1;
        // Loop counter starting from 1

        // Loop to calculate factorial using multiplication
        while (i <= number) {
            factorial = factorial * i;
            // Multiplying current value of factorial with i
            i++;
            // Moving to the next number
        }

        System.out.println(factorial);
        // Displaying the factorial result
    }
}
