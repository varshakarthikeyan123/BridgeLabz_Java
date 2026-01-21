/*
 This program calculates the profit and profit percentage
 based on the given cost price and selling price.
 It demonstrates basic arithmetic operations,
 percentage calculation, and output statements in Java.
*/

package CoreProgramming.programmingelements.Level1;

public class Profit {

    public static void main(String[] args) { // main method where program execution starts

        double CP = 129; // stores the cost price
        double SP = 191; // stores the selling price

        double profit = SP - CP; // calculates profit
        double profitPercentage = (profit / CP) * 100; // calculates profit percentage

        System.out.println(
                "The Cost price is INR " + CP + " and the Selling Price is INR " + SP + "."
        ); // displays cost price and selling price

        System.out.println(
                "The profit is INR " + profit
                        + " and the Profit Percentage is: " + profitPercentage + "%."
        ); // displays profit and profit percentage
    }
}
