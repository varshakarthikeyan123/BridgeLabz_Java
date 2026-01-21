/*
 This program calculates the total income of a person
 by adding salary and bonus entered by the user.
 It demonstrates user input using Scanner,
 basic addition, and displaying the result in Java.
*/

package coreprogramming.programmingelements.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class TotalIncome {

    public static void main(String[] args) { // main method where program execution starts

        Scanner input = new Scanner(System.in); // creates Scanner object for reading user input

        System.out.print("Enter salary: "); // prompts user to enter salary
        float salary = input.nextFloat(); // reads salary amount

        System.out.print("Enter bonus: "); // prompts user to enter bonus
        float bonus = input.nextFloat(); // reads bonus amount

        float income = salary + bonus; // calculates total income

        System.out.println(
                "The salary is INR " + salary
                        + " and bonus is INR " + bonus + ". "
                        + "Hence the total income is INR " + income + "."
        ); // displays salary, bonus, and total income
    }
}
