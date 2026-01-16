package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int N = input.nextInt();
        // Reading the number from the user

        int length = (int) Math.log10(N) + 1;
        // Calculating the number of digits in the number
        // log10(N) gives (digits - 1), so we add 1

        System.out.println("The lenght of the given number is: " + length);

        int original = N;
        // Storing the original number for comparison later

        System.out.println("The original number is: " + original);

        int sum = 0;
        // Variable to store the sum of powered digits

        // Loop to extract each digit and calculate the Armstrong sum
        while (N > 0) {

            int digit = N % 10;
            // Extracting the last digit of the number

            sum += Math.pow(digit, length);
            // Raising the digit to the power of total digits and adding to sum

            N = N / 10;
            // Removing the last digit from the number
        }

        System.out.println("The sum of the given number is: " + sum);

        // Checking if the number is an Armstrong number
        if (original == sum) {
            System.out.println("The given number is a armstrong number.");
        }
        else {
            System.out.println("The given number is not a armstrong number.");
        }
    }
}
