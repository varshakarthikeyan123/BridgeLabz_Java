/*
 This program calculates how many rounds an athlete
 must run to complete a total distance of 5 km,
 based on the perimeter of a triangular track.
 It takes the three sides of the track as input,
 computes the perimeter, and determines the
 number of rounds required.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class Rounds {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter first side: "); // prompts user to enter first side of the track
        float side1 = input.nextFloat(); // reads first side length

        System.out.print("Enter second side: "); // prompts user to enter second side of the track
        float side2 = input.nextFloat(); // reads second side length

        System.out.print("Enter third side: "); // prompts user to enter third side of the track
        float side3 = input.nextFloat(); // reads third side length

        float perimeter = side1 + side2 + side3; // calculates perimeter of the triangular track
        float rounds = 5 / perimeter; // calculates number of rounds to complete 5 km

        System.out.println(
                "The total number of rounds the athlete will run is "
                        + rounds + " to complete 5 km."
        ); // displays the number of rounds
    }
}
