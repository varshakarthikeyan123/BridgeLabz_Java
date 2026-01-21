/*
 This program converts distance from kilometers to miles
 using a fixed conversion factor.
*/
package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner; // Importing Scanner class to take user input

public class MilesConversion {
    public static void main(String[] args) {

        final double multiplier = 0.621371; // Conversion factor from kilometers to miles

        Scanner input = new Scanner(System.in); // Creating Scanner object for input

        System.out.print("Enter the value in kilometers: "); // Prompting user for kilometers
        double Km = input.nextDouble(); // Reading distance in kilometers

        double Miles = Km * multiplier; // Converting kilometers to miles

        System.out.println("The distance in miles is: " + Miles + " mi."); // Displaying result
    }
}
