package CoreProgramming.ArrayPractice.Level2;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class SalaryBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read input

        int n = 10;
        // Number of employees

        double[] salary = new double[n];
        // Array to store salary of each employee

        double[] service = new double[n];
        // Array to store years of service of each employee

        double[] bonus = new double[n];
        // Array to store calculated bonus for each employee

        double[] newSalary = new double[n];
        // Array to store new salary after adding bonus

        double totalBonus = 0;
        // Variable to store total bonus payout

        double totalOldSalary = 0;
        // Variable to store total of original salaries

        double totalNewSalary = 0;
        // Variable to store total salary after bonus

        // Loop to take salary and service details for each employee
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            // Reading salary input

            System.out.print("Enter years of service: ");
            service[i] = sc.nextDouble();
            // Reading years of service

            // Validation: salary must be positive and service cannot be negative
            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                // Decrementing i to re-enter details for the same employee
                continue;
                // Skipping remaining code for this iteration
            }
        }

        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < n; i++) {

            // Bonus calculation based on years of service
            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
                // 5% bonus for service greater than 5 years
            } else {
                bonus[i] = salary[i] * 0.02;
                // 2% bonus for service 5 years or less
            }

            newSalary[i] = salary[i] + bonus[i];
            // Calculating new salary after adding bonus

            totalBonus += bonus[i];
            // Adding bonus to total bonus payout

            totalOldSalary += salary[i];
            // Adding original salary to total old salary

            totalNewSalary += newSalary[i];
            // Adding new salary to total new salary
        }

        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        System.out.println("Total Bonus Payout: ₹" + totalBonus);
        System.out.println("Total New Salary: ₹" + totalNewSalary);

        sc.close();
        // Closing Scanner to release system resources
    }
}
