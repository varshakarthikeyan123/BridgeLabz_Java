package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DivisibilityCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        // Checking if the number is divisible by 5
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
