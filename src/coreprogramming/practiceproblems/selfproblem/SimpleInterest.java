/*
 This program calculates Simple Interest.
 It takes the principal amount, rate of interest,
 and time period from the user and applies the
 simple interest formula to compute the result.
*/
package coreprogramming.practiceproblems.selfproblem;

import java.util.Scanner; // Importing Scanner class to take user input

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creating Scanner object for input

        System.out.print("Enter principle amount: ");
        double principle = input.nextDouble(); // Reading principal amount

        System.out.print("Enter interest rate: ");
        double rate = input.nextDouble(); // Reading rate of interest

        System.out.print("Enter time:  ");
        double time = input.nextDouble(); // Reading time period

        double simpleInterest = (principle * rate * time) / 100;
        // Calculating simple interest using formula

        System.out.println("Simple interest is: " + "Rupees " + simpleInterest);
        // Displaying the calculated simple interest
    }
}
