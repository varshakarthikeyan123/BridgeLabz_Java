package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int N = input.nextInt();
        // Reading the number from the user

        int original = N;
        // Storing the original number for divisibility check

        int sum = 0;
        // Variable to store the sum of digits

        // Loop to extract digits and calculate their sum
        while (N > 0) {

            int digit = N % 10;
            // Extracting the last digit of the number

            sum += digit;
            // Adding digit to the sum

            N = N / 10;
            // Removing the last digit from the number
        }

        // Checking whether the original number is divisible by sum of its digits
        if (original % sum == 0) {
            System.out.println("The given number is a harshad number");
        }
        else {
            System.out.println("The given number is not a harshad number");
        }
    }
}
