package ioprogramming.csvdatahandling.basic;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRowsCSV {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {

            br.readLine(); // skip header

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total Records: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
