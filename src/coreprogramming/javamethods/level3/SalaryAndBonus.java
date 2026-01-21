/*
 This program generates salary and years-of-service data for employees,
 calculates bonus based on years of service, and displays old salary,
 bonus amount, new salary, and total summaries.
*/
package CoreProgramming.javamethods.level3;

import java.util.Random;

public class SalaryAndBonus {

    // Method to generate employee salary and years of service
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];
        // data[i][0] -> salary, data[i][1] -> years of service

        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // Generates salary between 10000 and 99999
            data[i][1] = rand.nextInt(10) + 1;       // Generates years between 1 and 10
        }
        return data;
    }

    // Method to calculate bonus and updated salary
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];
        // result[i][0] -> new salary, result[i][1] -> bonus

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = data[i][1];

            // Bonus is 5% if years > 5, otherwise 2%
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            result[i][0] = salary + bonus; // Updated salary
            result[i][1] = bonus;          // Bonus amount
        }
        return result;
    }

    // Method to print individual employee details and totals
    public static void printResults(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        // Variables to store total salaries and bonus

        for (int i = 0; i < data.length; i++) {
            totalOld += data[i][0];    // Sum of old salaries
            totalNew += result[i][0];  // Sum of new salaries
            totalBonus += result[i][1]; // Sum of bonuses

            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + data[i][0]);
            System.out.println("Years: " + data[i][1]);
            System.out.println("Bonus: " + result[i][1]);
            System.out.println("New Salary: " + result[i][0]);
            System.out.println();
        }

        // Printing final totals
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {

        // Generate data for 10 employees
        int[][] employees = generateEmployeeData(10);

        // Calculate bonus and updated salary
        double[][] updated = calculateBonus(employees);

        // Print all results
        printResults(employees, updated);
    }
}
