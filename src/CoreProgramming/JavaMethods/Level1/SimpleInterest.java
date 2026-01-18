/*
 This program calculates Simple Interest using the formula:
 Simple Interest = (Principal × Rate × Time) / 100.
 It takes user input for principal amount, rate of interest, and time period,
 then displays the calculated simple interest.
*/
package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double interest(double principle, double rate, double time) {

        double SI = (principle * rate * time) / 100;
        // Calculating simple interest using the standard formula

        return SI;
        // Returning the calculated simple interest value
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read input from the user

        System.out.print("Enter principle: ");
        double principle = input.nextDouble();
        // Reading the principal amount

        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        // Reading the rate of interest

        System.out.print("Enter time: ");
        double time = input.nextDouble();
        // Reading the time period

        double simpleInterest = interest(principle, rate, time);
        // Calling the interest method to calculate simple interest

        System.out.println(
                "The simple interest is " + simpleInterest +
                        " for the principle " + principle +
                        " rate of interest " + rate +
                        " and time " + time
        );
        // Displaying the calculated simple interest with input details
    }
}
