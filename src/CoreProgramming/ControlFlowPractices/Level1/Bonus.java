/*
 This program calculates bonus eligibility for an employee.
 If the employee has worked for more than 5 years,
 a 5% bonus on salary is calculated and displayed.
 Otherwise, it displays that no bonus is applicable.
*/
package CoreProgramming.ControlFlowPractices.Level1; // Defines the package for control flow practice programs (Level 1)

import java.util.Scanner; // Scanner class is used to take input from the user

public class Bonus { // Main class definition
    public static void main(String[] args) { // Main method where program execution starts

        Scanner input = new Scanner(System.in); // Creating Scanner object to read user input

        System.out.print("Enter salary: "); // Prompting user to enter salary
        double salary = input.nextDouble(); // Reading the employee's salary

        System.out.print("Enter years of service: "); // Prompting user to enter years of service
        double years = input.nextDouble(); // Reading the number of years worked

        // Checking if the employee is eligible for bonus
        if (years > 5) { // Condition to check service greater than 5 years

            double bonus = (salary * 5) / 100; // Calculating 5% bonus on salary

            System.out.println("The bonus received is: " + bonus); // Displaying bonus amount
        }
        else { // Executes if service is 5 years or less
            System.out.println("No bonus."); // Displaying no bonus message
        }
    }
}
