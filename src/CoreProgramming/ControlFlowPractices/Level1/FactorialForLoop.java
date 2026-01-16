package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FactorialForLoop {
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
        // Variable to store factorial result, initialized to 1

        // for loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            // Multiplying factorial with current value of i
        }

        System.out.println(factorial);
        // Displaying the factorial result
    }
}
