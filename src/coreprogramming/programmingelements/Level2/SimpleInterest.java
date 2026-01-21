/*
 This program calculates Simple Interest based on
 the principle amount, rate of interest, and time
 entered by the user.
 It uses the standard Simple Interest formula:
 SI = (P × R × T) / 100.
 The program demonstrates user input, arithmetic
 calculation, and output in Java.
*/

package coreprogramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class SimpleInterest {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter principle amount: "); // prompts user to enter principle amount
        double principle = input.nextDouble(); // reads principle amount

        System.out.print("Enter interest rate: "); // prompts user to enter rate of interest
        double rate = input.nextDouble(); // reads interest rate

        System.out.print("Enter time: "); // prompts user to enter time period
        double time = input.nextDouble(); // reads time

        double simpleInterest = (principle * rate * time) / 100; // calculates simple interest

        System.out.println(
                "The Simple Interest is " + simpleInterest
                        + " for Principle " + principle + ", "
                        + "Rate of Interest " + rate
                        + " and Time " + time + "."
        ); // displays the calculated simple interest
    }
}
