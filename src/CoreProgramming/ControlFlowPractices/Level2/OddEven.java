package CoreProgramming.ControlFlowPractices.Level2;

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
        // Variable to count how many even numbers are found

        int countOdd = 0;
        // Variable to count how many odd numbers are found

        // Loop from 1 to the entered number
        for (int i = 1; i <= number; i++) {

            // Checking whether the current number is even
            if (i % 2 == 0) {
                System.out.println(i + " Even");
                countEven++;
                // Incrementing even count
            }
            // If the number is not even, it must be odd
            else {
                System.out.println(i + " Odd");
                countOdd++;
                // Incrementing odd count
            }
        }

        System.out.println("The count of even numbers found in number from 1 to "
                + number + " are: " + countEven);

        System.out.println("The count of odd numbers found in number from 1 to "
                + number + " are: " + countOdd);
    }
}
