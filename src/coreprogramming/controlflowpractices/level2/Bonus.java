/*
 This program calculates the bonus for an employee.
 It takes salary and years of service as input.
 If the years of service are greater than 5,
 the employee receives a 5% bonus on the salary.
*/
package coreprogramming.controlflowpractices.level2;
// Package declaration for Level 2 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Bonus {
    // Main class definition

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter salary: ");
        // Prompting user to enter salary
        double salary = input.nextDouble();
        // Reading the employee's salary

        System.out.print("Enter years of service: ");
        // Prompting user to enter years of service
        double years = input.nextDouble();
        // Reading the number of years the employee has worked

        // Checking if the employee is eligible for bonus
        if (years > 5) {

            double bonus = (salary * 5) / 100;
            // Calculating 5% bonus on the salary

            System.out.println("The bonus received is: " + bonus);
            // Displaying the calculated bonus
        }
        else {
            System.out.println("No bonus.");
            // Displayed when service is 5 years or less
        }
    }
}
