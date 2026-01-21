/*
 This program calculates the total number of possible handshakes
 among a given number of students using the combination formula nC2.
 It uses a separate method to perform the handshake calculation
 and displays the final result to the user.
*/
package CoreProgramming.javamethods.level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class HandShakes {

    // Method to calculate the number of possible handshakes
    public static float handShake(int n) {

        float combination = (n * (n - 1)) / 2;
        // Calculating handshakes using the formula n*(n-1)/2

        return combination;
        // Returning the calculated number of handshakes
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        // Reading the number of students

        float handShakes = handShake(n);
        // Calling the handShake method to calculate handshakes

        System.out.println("The number of possible handshakes is: " + handShakes);
        // Displaying the final result
    }
}
