package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class NumberOfRounds {

    // Method to calculate number of rounds needed to complete 5 km
    public static float rounds(float side1, float side2, float side3) {

        float perimerter = side1 + side2 + side3;
        // Calculating the perimeter of the triangular track

        float rounds = 5 / perimerter;
        // Calculating number of rounds needed to complete 5 km

        return rounds;
        // Returning the calculated number of rounds
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter frst side: ");
        float side1 = input.nextFloat();
        // Reading first side length

        System.out.print("Enter second side: ");
        float side2 = input.nextFloat();
        // Reading second side length

        System.out.print("Enter third side: ");
        float side3 = input.nextFloat();
        // Reading third side length

        float runningRounds = rounds(side1, side2, side3);
        // Calling rounds method to calculate required rounds

        System.out.println(
                "The number of rounds needed to do to complete a 5 km round: "
                        + runningRounds
        );
        // Printing the final result
    }
}
