package ioprogramming.csvdatahandling.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String file = "employees.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write("ID,Name,Department,Salary");
            bw.newLine();

            bw.write("1,Preethi,IT,50000");
            bw.newLine();

            bw.write("2,Raj,HR,45000");
            bw.newLine();

            bw.write("3,Asha,Finance,60000");
            bw.newLine();

            bw.write("4,Kumar,IT,70000");
            bw.newLine();

            bw.write("5,Divya,Marketing,55000");

            System.out.println("employees.csv created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
