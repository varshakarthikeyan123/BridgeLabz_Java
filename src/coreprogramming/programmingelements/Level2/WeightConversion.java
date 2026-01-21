/*
 This program converts a person's weight from pounds
 to kilograms.
 It takes the weight in pounds as input from the user,
 applies a conversion formula,
 and displays the result.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package coreprogramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class WeightConversion {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter weight in pounds: "); // prompts user to enter weight in pounds
        float weight = input.nextFloat(); // reads weight in pounds

        double kg = weight * 2.2; // converts weight from pounds to kilograms

        System.out.println(
                "The weight of the person in pounds is " + weight + " lb "
                        + "and in kg is " + kg + " kg."
        ); // displays weight in both units
    }
}
