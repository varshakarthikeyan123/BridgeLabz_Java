/*
 This program calculates the discount amount and
 the final payable university fee after applying
 a given discount percentage.
 It takes the original fee and discount percentage
 as input from the user.
 The program demonstrates user input, percentage
 calculation, and output in Java.
*/

package CoreProgramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class to read input from the user

public class UniversityDiscount {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for user input

        System.out.print("Enter the fee in INR: "); // prompts user to enter original fee
        double fee = input.nextDouble(); // reads fee amount

        System.out.print("Enter the discount percentage (divide by 100): "); // prompts user for discount percentage
        double discountPercent = input.nextDouble(); // reads discount percentage

        double discount = fee * discountPercent; // calculates discount amount
        double discountedFee = fee - discount; // calculates final fee after discount

        System.out.println(
                "The discount amount is INR " + discount
                        + " and final discounted fee is INR " + discountedFee + "."
        ); // displays discount and final fee
    }
}
