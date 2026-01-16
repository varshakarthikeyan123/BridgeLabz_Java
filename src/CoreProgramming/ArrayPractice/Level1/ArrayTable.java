package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner is used to take input from the user

public class ArrayTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input

        System.out.print("Enter the number for which the multiplication table is needed: ");
        int number = input.nextInt();
        // Reading the number for which multiplication table is required

        int[] table = new int[4];
        // Declaring an array of size 4 to store multiplication results (6 to 9)

        int value = 0;
        // This variable is used as an index to store values in the array

        // Loop to calculate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            table[value] = number * i;
            // Storing the multiplication result in the array
            value++;
            // Moving to the next index of the array
        }

        System.out.print("The array with multiplication table from 9 to 6 is: ");

        // Loop to display the elements of the array
        for (int i = 0; i <= table.length - 1; i++) {
            System.out.print(table[i] + " ");
        }
    }
}
