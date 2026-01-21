/*
 This program checks and prints whether numbers from 1 to a given number
 are odd or even.
 It also counts how many even and odd numbers are present.
*/
package coreprogramming.controlflowpractices.level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to ensure the number entered is positive and non-zero
        while (number <= 0) {
            System.out.print("Enter a positive non-zero number: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        int countEven = 0;
        // Variable to count the number of even values

        int countOdd = 0;
        // Variable to count the number of odd values

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {

            // Checking if the current number is even
            if (i % 2 == 0) {
                System.out.println(i + " Even");
                // Printing even number

                countEven++;
                // Incrementing even counter
            }
            // If not even, then the number is odd
            else {
                System.out.println(i + " Odd");
                // Printing odd number

                countOdd++;
                // Incrementing odd counter
            }
        }

        System.out.println("The count of even numbers found in number from 1 to "
                + number + " are: " + countEven);
        // Displaying total count of even numbers

        System.out.println("The count of odd numbers found in number from 1 to "
                + number + " are: " + countOdd);
        // Displaying total count of odd numbers
    }
}
