package ioprogramming.csvdatahandling.advanced;

import java.io.*;
import java.util.*;

public class CSVToObject {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {

            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                Student s = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                list.add(s);
            }

            list.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
