package ioprogramming.csvdatahandling.basic;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadStudentCSV {

    public static void main(String[] args) {

        String file = "students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine(); // header
            System.out.println("Header: " + line);

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println("ID: " + data[0]);
                System.out.println("Name: " + data[1]);
                System.out.println("Age: " + data[2]);
                System.out.println("Marks: " + data[3]);
                System.out.println("---------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
