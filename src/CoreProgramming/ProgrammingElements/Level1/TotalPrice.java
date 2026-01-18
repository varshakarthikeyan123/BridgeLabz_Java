/*
 This program calculates the total purchase price
 based on the unit price and quantity entered by the user.
 It demonstrates user input using Scanner,
 multiplication for price calculation,
 and displaying the final result in Java.
*/

package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class TotalPrice {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter unit price in INR: "); // prompts user to enter unit price
        float unitPrice = input.nextFloat(); // reads unit price

        System.out.print("Enter quantity: "); // prompts user to enter quantity
        int quantity = input.nextInt(); // reads quantity

        float price = unitPrice * quantity; // calculates total purchase price

        System.out.println(
                "The total purchase price is INR " + price
                        + " if the quantity is " + quantity
                        + " and the unit price is INR " + unitPrice
        ); // displays the total price
    }
}
