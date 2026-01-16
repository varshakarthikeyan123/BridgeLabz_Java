package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class CountingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Loop to ensure the number entered is greater than zero
        while (number <= 0) {
            System.out.print("Enter a number greater than zero: ");
            number = input.nextInt();
            // Asking again until a valid number is entered
        }

        int sum = 0;
        // Variable to store the sum of first 'number' natural numbers

        // Loop used to calculate the sum using formula
        while (number > 0) {
            sum = number * (number + 1) / 2;
            // Formula to calculate sum of first n natural numbers
            break;
            // Breaking because calculation is needed only once
        }

        System.out.println("The sum of " + number + " numbers is: " + sum + ".");

        // Checking whether the given number is equal to the calculated sum
        if (number == sum) {
            System.out.println("The number is equal to the sum of " + number
                    + " numbers");
        }
        else {
            System.out.println("The number is not equal to the sum of " + number
                    + " numbers");
        }
    }
}
