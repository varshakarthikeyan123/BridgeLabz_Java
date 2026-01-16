package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        // Reading a natural number from the user

        // Checking if the entered number is a valid natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
            // Exits the program if the input is invalid
        }

        int[] even = new int[number / 2 + 1];
        // Array to store even numbers up to the given number
        // Size is calculated to ensure enough space

        int[] odd = new int[number / 2 + 1];
        // Array to store odd numbers up to the given number

        int evenIndex = 0;
        // Keeps track of the current index for the even array

        int oddIndex = 0;
        // Keeps track of the current index for the odd array

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {

            // Checking whether the number is even or odd
            if (i % 2 == 0) {
                even[evenIndex] = i;
                // Storing even number in even array
                evenIndex++;
                // Moving to the next index in even array
            } else {
                odd[oddIndex] = i;
                // Storing odd number in odd array
                oddIndex++;
                // Moving to the next index in odd array
            }
        }

        System.out.println("\nOdd numbers:");

        // Loop to display all stored odd numbers
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nEven numbers:");

        // Loop to display all stored even numbers
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
