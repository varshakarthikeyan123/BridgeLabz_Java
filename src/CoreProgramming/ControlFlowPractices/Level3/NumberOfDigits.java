package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        // Reading the number from the user

        int count = 0;
        // Variable to count the number of digits

        // Loop to count digits in the number
        // Each iteration removes one digit from the number
        while (N != 0) {
            N = N / 10;
            // Removing the last digit

            count++;
            // Incrementing digit count
        }

        System.out.println(count);
        // Printing the total number of digits
    }
}
