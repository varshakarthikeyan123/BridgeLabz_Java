/*
 This program calculates the total number of possible
 handshakes among a given number of students.
 It uses the mathematical combination formula
 n * (n - 1) / 2 to find the result.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package coreprogramming.programmingelements.Level1;

import java.util.Scanner; // imports Scanner class for taking user input

public class HandShake {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object to read input

        System.out.print("Enter the number of students: "); // prompts user to enter number of students
        int numberOfStudents = input.nextInt(); // reads number of students

        float combination = (numberOfStudents * (numberOfStudents - 1)) / 2; // calculates possible handshakes

        System.out.println(
                "The number of possible handshakes is: " + combination
        ); // displays the result
    }
}
