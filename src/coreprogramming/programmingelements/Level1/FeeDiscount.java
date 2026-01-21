/*
 This program calculates the discount on a course fee
 and determines the final fee after applying the discount.
 It demonstrates the use of variables, percentage
 calculation, and output in Java.
*/

package coreprogramming.programmingelements.Level1;

public class FeeDiscount {

    public static void main(String[] args) { // main method where program execution starts

        double fee = 125000; // stores the original course fee
        double discountPercent = 0.10; // stores discount percentage (10%)

        double discount = fee * discountPercent; // calculates the discount amount
        double discountedFee = fee - discount; // calculates the final fee after discount

        System.out.println(
                "The discount amount is INR " + discount
                        + " and final discounted fee is INR " + discountedFee + "."
        ); // displays discount and final fee
    }
}
