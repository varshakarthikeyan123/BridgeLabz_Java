package CoreProgramming.ArrayPractice.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class FootBallTeam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        double[] heights = new double[11];
        // Declaring an array to store heights of 11 football players

        System.out.print("Enter height of 11 players: ");

        // Loop to read heights of all 11 players
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
            // Storing each player's height in the array
        }

        System.out.print("The entered heights are: ");

        // Loop to display the entered heights
        for (int i = 0; i < 11; i++) {
            System.out.println(heights[i] + " ");
        }

        int sum = 0;
        // Variable to store the total sum of heights

        // Loop to calculate the sum of all heights
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
            // Adding each player's height to sum
        }

        System.out.println("The sum of heights is: " + sum);

        double meanHeight = sum / 11;
        // Calculating mean (average) height of the players

        System.out.println("The mean height of 11 football players is: " + meanHeight);
    }
}
