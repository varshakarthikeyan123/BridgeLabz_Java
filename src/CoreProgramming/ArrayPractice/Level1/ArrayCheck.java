package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ArrayCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter array of numbers: ");

        int[] number = new int[5];
        // Declaring an integer array of size 5

        // Loop to take 5 numbers as input and store them in the array
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }

        System.out.print("Array of numbers are: ");

        // Loop to display the elements of the array
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i] + " ");
        }

        // Loop to check whether each number is positive, negative, or zero
        // Also checks even or odd for positive numbers
        for (int i = 0; i < number.length; i++) {

            if (number[i] > 0) {
                System.out.println(number[i] + " is Positive.");

                // Checking if the positive number is even or odd
                if (number[i] % 2 == 0) {
                    System.out.println(number[i] + " is even.");
                } else {
                    System.out.println(number[i] + " is odd.");
                }
            }
            else if (number[i] < 0) {
                System.out.println(number[i] + " is Negative.");
            }
            else {
                System.out.println(number[i] + " is Zero.");
            }
        }

        // Loop used to compare first and last elements of the array
        // break is used because comparison is needed only once
        for (int i = 1; i < number.length; i++) {

            if (number[0] > number[number.length - 1]) {
                System.out.println(number[0] + " is largest.");
                break;
            }
            else if (number[0] < number[number.length - 1]) {
                System.out.println(number[0] + " is smallest.");
                break;
            }
            else {
                System.out.println(number[0] + " and " + number[number.length - 1] + " are equal.");
                break;
            }
        }
    }
}
