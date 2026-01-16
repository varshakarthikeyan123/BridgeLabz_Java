package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Reading the number for which the multiplication table is required

        int table = 0;
        // Variable to store the multiplication result

        // Loop to generate multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {

            table = number * i;
            // Calculating multiplication result

            System.out.println(
                    "The multiplication table for the number " + number +
                            " from 6 to 9 is: " + table
            );
            // Displaying the multiplication result
        }
    }
}
