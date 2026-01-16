package CoreProgramming.JavaMethods.Level3;

import java.util.Random;

public class SalaryAndBonus {

    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // salary
            data[i][1] = rand.nextInt(10) + 1;       // years
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void printResults(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        for (int i = 0; i < data.length; i++) {
            totalOld += data[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];

            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + data[i][0]);
            System.out.println("Years: " + data[i][1]);
            System.out.println("Bonus: " + result[i][1]);
            System.out.println("New Salary: " + result[i][0]);
            System.out.println();
        }

        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData(10);
        double[][] updated = calculateBonus(employees);
        printResults(employees, updated);
    }
}
