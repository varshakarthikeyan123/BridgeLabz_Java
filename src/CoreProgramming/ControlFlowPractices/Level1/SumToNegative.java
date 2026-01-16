package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumToNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        double total = 0.0;
        // Variable to store the running sum of entered numbers

        // Infinite loop to keep accepting numbers until a stop condition is met
        while (true) {

            System.out.print("Enter number: ");
            double value = input.nextDouble();
            // Reading a number from the user

            // If the user enters zero or a negative number, stop the loop
            if (value <= 0) {
                break;
                // Exits the loop
            }

            total = total + value;
            // Adding the entered value to the total sum

            System.out.println("The sum is: " + total);
            // Displaying the current sum after each valid input
        }

        System.out.println("The sum achieved before reaching zero or a negative number is: " + total);
        // Displaying the final sum before termination

        System.out.println("The user has entered zero or a negative number");
        // Informing why the loop stopped
    }
}
