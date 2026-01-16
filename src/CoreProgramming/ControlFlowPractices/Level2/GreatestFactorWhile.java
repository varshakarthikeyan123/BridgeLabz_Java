package CoreProgramming.ControlFlowPractices.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number for which the greatest factor is to be found

        int greatestFactor = 1;
        // Initializing greatest factor as 1
        // 1 is a factor of every integer

        int counter = number - 1;
        // Starting counter from one less than the number

        // Loop runs from (number - 1) down to 1
        while (counter >= 1) {

            // Checking if counter is a factor of the number
            if (number % counter == 0) {
                greatestFactor = counter;
                // Assigning the greatest factor found
                break;
                // Exiting loop after finding the first (largest) factor
            }

            counter--;
            // Decrementing counter to check the next smaller number
        }

        System.out.println("Greatest factor: " + greatestFactor);
        // Printing the greatest factor
    }
}
