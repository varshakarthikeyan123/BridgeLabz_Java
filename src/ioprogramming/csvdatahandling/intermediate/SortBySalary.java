package ioprogramming.csvdatahandling.intermediate;

import java.io.*;
import java.util.*;

public class SortBySalary {

    public static void main(String[] args) {

        List<String[]> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {

            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {
                employees.add(line.split(","));
            }

            employees.sort((a, b) ->
                    Double.compare(Double.parseDouble(b[3]),
                            Double.parseDouble(a[3])));

            System.out.println("Top 5 Highest Paid Employees:");

            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                System.out.println(String.join(",", employees.get(i)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
