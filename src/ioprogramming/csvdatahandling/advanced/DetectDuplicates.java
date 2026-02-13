package ioprogramming.csvdatahandling.advanced;

import java.io.*;
import java.util.*;

public class DetectDuplicates {

    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {

            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (!ids.add(data[0])) {
                    System.out.println("Duplicate Record: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
