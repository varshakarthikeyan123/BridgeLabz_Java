/*
 This program converts a distance entered in feet
 into yards and miles.
 It demonstrates user input using Scanner,
 unit conversion using arithmetic operations,
 and displaying results to the user.
*/

package CoreProgramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class to take input from the user

public class DistanceConversion {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading input

        System.out.print("Enter distance in feet: "); // prompts user to enter distance in feet
        float feet = input.nextFloat(); // reads distance in feet

        float yard = feet / 3; // converts feet to yards
        float mile = yard / 1760; // converts yards to miles

        System.out.println(
                "Your distance in feet is " + feet + " ft "
                        + "while in yard is " + yard + " yd "
                        + "and in mile is " + mile + " mi."
        ); // displays the converted distances
    }
}
