package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class HandShake2 {

    // Method to calculate number of possible handshakes
    public static float handShake(int n) {

        float combination = (n * (n - 1)) / 2;
        // Using combination formula nC2 to calculate handshakes

        return combination;
        // Returning total number of handshakes
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        // Reading number of students

        float handShakes = handShake(n);
        // Calling handShake method

        System.out.println("The number of possible handshakes is: " + handShakes);
        // Printing the result
    }
}
