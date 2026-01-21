/*
 This program calculates how many chocolates each child will get
 and how many chocolates will remain after equal distribution.
 It uses a method to perform division and modulus operations
 and returns the result using an integer array.
*/
package coreprogramming.javamethods.level1; // Defines the package for this class

import java.util.Scanner; // Imports Scanner class to take input from the user

public class ChocolateAndChildren { // Class definition

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] childrenAndChocolate(int numberOfChocolates, int numberOfChildren) {

        int get = numberOfChocolates / numberOfChildren;
        // Calculates chocolates each child receives using division

        int left = numberOfChocolates % numberOfChildren;
        // Calculates remaining chocolates using modulus

        return new int[]{get, left};
        // Returns the received and remaining chocolates as an array
    }

    public static void main(String[] args) { // Main method starts execution

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        // Reading the number of children

        System.out.print("Enter number of chocolate: ");
        int numberOfChocolates = input.nextInt();
        // Reading the number of chocolates

        int[] outPut = childrenAndChocolate(numberOfChocolates, numberOfChildren);
        // Calling method to calculate chocolate distribution

        System.out.println(
                "The number of chocolates received and remaining are: "
                        + outPut[1] + " and " + outPut[0]
        );
        // Printing remaining chocolates first and chocolates received per child
    }
}
