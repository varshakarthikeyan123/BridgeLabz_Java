package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double interest(double principle, double rate, double time) {

        double SI = (principle * rate * time) / 100;
        // Formula to calculate Simple Interest

        return SI;
        // Returning calculated simple interest
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter principle: ");
        double principle = input.nextDouble();
        // Reading principal amount

        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        // Reading rate of interest

        System.out.print("Enter time: ");
        double time = input.nextDouble();
        // Reading time period

        double simpleInterest = interest(principle, rate, time);
        // Calling interest method to calculate simple interest

        System.out.println(
                "The simple interest is " + simpleInterest +
                        " for the principle " + principle +
                        " rate of interest " + rate +
                        " and time " + time
        );
        // Printing the calculated simple interest
    }
}
