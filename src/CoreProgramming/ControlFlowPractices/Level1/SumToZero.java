package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SumToZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        double value = input.nextDouble();
        // Reading the first number from the user

        double total = 0.0;
        // Variable to store the running sum of entered numbers

        // Loop continues as long as the entered number is positive
        while (value > 0) {

            total = total + value;
            // Adding the current value to total sum

            System.out.println("The sum is: " + total);
            // Displaying the updated sum

            System.out.print("Enter number: ");
            value = input.nextDouble();
            // Reading the next number
        }

        System.out.println("The sum achieved before reaching zeros is: " + total);
        // Displaying the final sum before termination

        System.out.println("The user has entered zero");
        // Informing why the loop stopped
    }
}
