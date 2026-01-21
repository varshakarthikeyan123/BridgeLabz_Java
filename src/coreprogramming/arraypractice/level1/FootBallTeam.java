/*
 This program calculates the mean (average) height of a football team.
 It takes the heights of 11 players as input, stores them in an array,
 displays the heights, calculates the total sum, and finally computes
 the average height of the team.
*/
package coreprogramming.arraypractice.level1; // Defines the package for this program

import java.util.Scanner; // Scanner class is used to take input from the user

public class FootBallTeam { // Defines the main class
    public static void main(String[] args) { // Main method where execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        double[] heights = new double[11]; // Declaring an array to store heights of 11 players

        System.out.print("Enter height of 11 players: "); // Prompts user to enter heights

        // Loop to read heights of all 11 players
        for (int i = 0; i < 11; i++) { // Iterates 11 times
            heights[i] = input.nextDouble(); // Stores each player's height in the array
        }

        System.out.print("The entered heights are: "); // Message before displaying heights

        // Loop to display the entered heights
        for (int i = 0; i < 11; i++) { // Iterates through the array
            System.out.println(heights[i] + " "); // Prints each height
        }

        double sum = 0; // Variable to store the total sum of heights

        // Loop to calculate the sum of all heights
        for (int i = 0; i < 11; i++) { // Iterates through the array
            sum += heights[i]; // Adds each player's height to sum
        }

        System.out.println("The sum of heights is: " + sum); // Displays total sum

        double meanHeight = sum / 11; // Calculates the mean (average) height

        System.out.println("The mean height of 11 football players is: " + meanHeight); // Displays mean height
    }
}
