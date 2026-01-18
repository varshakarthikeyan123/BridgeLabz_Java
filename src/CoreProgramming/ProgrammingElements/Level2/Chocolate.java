/*
 This program calculates how chocolates are distributed
 among a given number of children.
 It uses a separate method to determine how many
 chocolates each child gets and how many remain.
 The program demonstrates method creation,
 method calling, user input, integer division,
 and modulus operation in Java.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class Chocolate {

    public static void divideChocolates(int numberOfChocolates, int numberOfChildren) {
        // calculates chocolates each child gets using integer division
        int eachChildGets = numberOfChocolates / numberOfChildren;

        // calculates remaining chocolates using modulus operator
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println(
                "The number of chocolates each child gets is " + eachChildGets
                        + " and the number of remaining chocolates are " + remaining + "."
        ); // displays distribution result
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter number of chocolates: "); // prompts user to enter chocolates count
        int numberOfChocolates = input.nextInt(); // reads number of chocolates

        System.out.print("Enter number of children: "); // prompts user to enter children count
        int numberOfChildren = input.nextInt(); // reads number of children

        divideChocolates(numberOfChocolates, numberOfChildren); // calls method to divide chocolates
    }
}
