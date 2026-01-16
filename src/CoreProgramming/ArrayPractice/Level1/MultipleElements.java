package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class MultipleElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        double[] array = new double[10];
        // Declaring an array of size 10 to store numbers

        double total = 0.0;
        // Variable to store the sum of array elements

        int index = 0;
        // Keeps track of how many elements are stored in the array

        // Infinite loop to keep taking input until a stop condition is met
        while (true) {

            System.out.print("Enter an number: ");
            double number = input.nextDouble();
            // Reading a number from the user

            // If the number is zero or negative, stop taking input
            if (number <= 0) {
                System.out.println("The number should be greater then zero.");
                break;
            }

            // If the array is full, stop taking input
            if (index == 10) {
                System.out.println("The array has reached maximum size.");
                break;
            }

            array[index] = number;
            // Storing the number in the array at the current index

            index++;
            // Moving to the next index position
        }

        System.out.println("The elements of the array are: ");

        // Loop to display stored elements and calculate their total
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
            total = total + array[i];
            // Adding each element to total
        }

        System.out.println("\nThe total is: " + total);
    }
}
