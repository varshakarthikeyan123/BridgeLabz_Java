package CoreProgramming.ControlFlowPractices.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class Bonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        // Reading the employee's salary

        System.out.print("Enter years of service: ");
        double years = input.nextDouble();
        // Reading the number of years the employee has worked

        // Checking if the employee is eligible for bonus
        if (years > 5) {

            double bonus = (salary * 5) / 100;
            // Calculating 5% bonus on salary

            System.out.println("The bonus received is: " + bonus);
        }
        else {
            System.out.println("No bonus.");
            // No bonus if service is 5 years or less
        }
    }
}
