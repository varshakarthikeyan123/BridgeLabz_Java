/*
 This program converts a distance from kilometers to miles.
 It takes the distance in kilometers as input from the user,
 performs the conversion using a standard formula,
 and displays the result.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package coreprogramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class to read user input

public class ConvertToMiles {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for input

        System.out.print("Enter the distance in km: "); // prompts user to enter distance
        double km = input.nextDouble(); // reads distance in kilometers

        double miles = km / 1.6; // converts kilometers to miles

        System.out.println(
                "The total miles is " + miles + " mi for the given km " + km + " km."
        ); // displays the converted distance
    }
}
