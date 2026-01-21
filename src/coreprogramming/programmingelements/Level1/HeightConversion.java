/*
 This program converts a person's height from centimeters
 to inches and feet.
 It takes height in centimeters as input from the user,
 performs the required unit conversions,
 and displays the results.
 The program demonstrates user input, arithmetic
 operations, and output in Java.
*/

package coreprogramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class HeightConversion {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter height in cm: "); // prompts user to enter height in centimeters
        double height = input.nextDouble(); // reads height value

        double inch = height / 2.54; // converts height from cm to inches
        double feet = inch / 12; // converts inches to feet

        System.out.print(
                "Your height in cm is " + height + " cm "
                        + "while in feet is " + feet + " ft "
                        + "and inches is " + inch + "″"
        ); // displays height in different units
    }
}
