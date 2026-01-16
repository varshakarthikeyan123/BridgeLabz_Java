package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class IntegerNumber {

    // Method to check whether the number is positive, negative, or zero
    public static void integerNum(int number) {

        // If number is greater than zero, it is positive
        if (number > 0) {
            System.out.println("The number entered is positive.");
        }
        // If number is less than zero, it is negative
        else if (number < 0) {
            System.out.println("The number entered is negative.");
        }
        // If number is neither positive nor negative, it is zero
        else {
            System.out.println("The number entered is zero.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = input.nextInt();
        // Reading the integer number

        integerNum(number);
        // Calling the method to check the number type
    }
}
