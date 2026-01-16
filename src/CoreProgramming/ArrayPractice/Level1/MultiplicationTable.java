package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter the number for which the multiplication table array is needed: ");
        int number = input.nextInt();
        // Reading the number for which multiplication table is required

        int[] multiplicationResult = new int[10];
        // Declaring an array of size 10 to store multiplication results (1 to 10)

        // Loop to calculate multiplication table values
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
            // i - 1 is used because array index starts from 0
        }

        // Loop to display the multiplication table stored in the array
        for (int i = 1; i <= 10; i++) {
            System.out.print(multiplicationResult[i - 1] + " ");
        }
    }
}
