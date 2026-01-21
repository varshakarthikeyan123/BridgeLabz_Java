/*
 This program calculates the number of rounds required
 to complete a total distance of 5 km on a triangular track.
 The perimeter of the triangle is calculated using its three sides,
 and the number of rounds is derived from that.
*/
package CoreProgramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberOfRounds {

    // Method to calculate number of rounds needed to complete 5 km
    public static float rounds(float side1, float side2, float side3) {

        float perimeter = side1 + side2 + side3;
        // Calculating the perimeter of the triangular track

        float rounds = 5 / perimeter;
        // Calculating number of rounds to complete 5 km

        return rounds;
        // Returning the calculated number of rounds
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first side: ");
        float side1 = input.nextFloat();
        // Reading first side length

        System.out.print("Enter second side: ");
        float side2 = input.nextFloat();
        // Reading second side length

        System.out.print("Enter third side: ");
        float side3 = input.nextFloat();
        // Reading third side length

        float runningRounds = rounds(side1, side2, side3);
        // Calling method to calculate required rounds

        System.out.println(
                "The number of rounds needed to complete 5 km is: "
                        + runningRounds
        );
        // Printing the final result
    }
}
