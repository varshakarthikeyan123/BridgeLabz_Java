/*
 This program calculates bonus and revised salary for employees.
 It takes salary and years of service for 10 employees,
 applies bonus rules based on service duration,
 and calculates total old salary, total bonus, and total new salary.
*/
package CoreProgramming.arraypractice.level2; // Defines the package for Level 2 array practice programs

import java.util.Scanner; // Scanner class is used to take input from the user

public class SalaryBonus { // Main class definition
    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read input

        int n = 10;
        // Total number of employees

        double[] salary = new double[n];
        // Array to store salary of each employee

        double[] service = new double[n];
        // Array to store years of service of each employee

        double[] bonus = new double[n];
        // Array to store calculated bonus for each employee

        double[] newSalary = new double[n];
        // Array to store salary after adding bonus

        double totalBonus = 0;
        // Variable to store total bonus payout

        double totalOldSalary = 0;
        // Variable to store total original salary

        double totalNewSalary = 0;
        // Variable to store total salary after bonus

        // Loop to take salary and service input for each employee
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));
            // Displays employee number

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            // Reads salary

            System.out.print("Enter years of service: ");
            service[i] = sc.nextDouble();
            // Reads years of service

            // Validation to ensure correct input
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                // Decrements index to re-enter details
                continue;
                // Skips remaining code for this iteration
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < n; i++) {

            // Bonus calculation based on service years
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
                // 5% bonus for service more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02;
                // 2% bonus for service 5 years or less
            }

            newSalary[i] = salary[i] + bonus[i];
            // Calculates new salary after bonus

            totalBonus += bonus[i];
            // Adds to total bonus

            totalOldSalary += salary[i];
            // Adds to total old salary

            totalNewSalary += newSalary[i];
            // Adds to total new salary
        }

        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        // Displays total original salary

        System.out.println("Total Bonus Payout: ₹" + totalBonus);
        // Displays total bonus amount

        System.out.println("Total New Salary: ₹" + totalNewSalary);
        // Displays total salary after bonus

        sc.close();
        // Closing Scanner to release system resources
    }
}
