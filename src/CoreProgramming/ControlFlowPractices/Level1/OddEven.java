/*
 This program checks and prints whether numbers from 1 to a given number
 are odd or even. It also counts how many even and odd numbers are present.
*/
package CoreProgramming.ControlFlowPractices.Level1; // Package declaration

import java.util.Scanner;
// Scanner class is used to take input from the user

public class OddEven { // Main class
    public static void main(String[] args) { // Main method

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        // Prompting user to enter a number

        int number = input.nextInt();
        // Reading the number from the user

        // Loop to ensure the number is positive and non-zero
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            // Asking user again for valid input
            number = input.nextInt();
            // Reading corrected input
        }

        int countEven = 0;
        // Variable to count even numbers

        int countOdd = 0;
        // Variable to count odd numbers

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {

            // Checking whether the current number is even
            if (i % 2 == 0) {
                System.out.println(i + " Even");
                // Printing even number
                countEven++;
                // Incrementing even count
            }
            else {
                System.out.println(i + " Odd");
                // Printing odd number
                countOdd++;
                // Incrementing odd count
            }
        }

        System.out.println("The count of even numbers found in number from 1 to "
                + number + " are: " + countEven);
        // Displaying total even numbers count

        System.out.println("The count of odd numbers found in number from 1 to "
                + number + " are: " + countOdd);
        // Displaying total odd numbers count
    }
}
