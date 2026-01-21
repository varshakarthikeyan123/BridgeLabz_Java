/*
 This program checks whether a given number is divisible by 5.
 It takes user input, applies the modulus operator,
 and displays the result based on the divisibility condition.
*/
package coreprogramming.controlflowpractices.level1; // Package for Level 1 control flow practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class DivisibilityCheck { // Main class
    public static void main(String[] args) { // Entry point of the program

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input from the keyboard

        System.out.print("Enter a number: ");
        // Prompting the user to enter a number

        int number = input.nextInt();
        // Reading the entered number

        // Checking if the number is divisible by 5 using modulus operator
        if (number % 5 == 0) {
            // If remainder is 0, the number is divisible by 5
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        }
        else {
            // If remainder is not 0, the number is not divisible by 5
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
