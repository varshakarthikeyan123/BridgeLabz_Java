package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner; // Scanner is used to take input from the user

public class Array2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input values from the keyboard

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        // Reading number of rows for the 2D array

        System.out.print("Enter columns: ");
        int columns = input.nextInt();
        // Reading number of columns for the 2D array

        int[][] arr = new int[rows][columns];
        // Declaring and creating a 2D array with given rows and columns

        int[] array = new int[rows * columns];
        // Declaring a 1D array to store all elements of the 2D array
        // Size is rows * columns because total elements in 2D array = rows × columns

        System.out.print("Enter elements of the 2D array: ");

        // Loop to take input for each element of the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = input.nextInt();
                // Storing user input into the 2D array
            }
        }

        System.out.println("The elements of the 2D array is: ");

        // Loop to display the elements of the 2D array in matrix form
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            // Moves to the next line after each row
        }

        int index = 0;
        // Index variable to keep track of position in the 1D array

        // Loop to convert 2D array into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = arr[i][j];
                // Copying each element from 2D array to 1D array
                index++;
                // Moving to the next index in the 1D array
            }
        }

        System.out.println("The 1D array is: ");

        // Loop to display elements of the 1D array
        for (int i = 0; i < rows * columns; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
