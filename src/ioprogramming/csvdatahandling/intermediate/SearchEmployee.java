package ioprogramming.csvdatahandling.intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String searchName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {

            br.readLine(); // skip header
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
