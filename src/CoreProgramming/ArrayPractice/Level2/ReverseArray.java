package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ReverseArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        // Reading the number from the user

        int length = (int) Math.log10(number) + 1;
        // Calculating the number of digits in the number
        // log10(number) gives digits - 1, so add 1

        int[] arr = new int[length];
        // Array to store digits in reverse order

        int index = 0;
        // Index to track position in the array

        // Loop to extract digits and store them in the array
        for (int i = 0; i < length; i++) {

            arr[index] = number % 10;
            // Extracting the last digit of the number

            number = number / 10;
            // Removing the last digit from the number

            index++;
            // Moving to the next index
        }

        System.out.println("The reverse array is: ");

        // Loop to display the reversed digits stored in the array
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
