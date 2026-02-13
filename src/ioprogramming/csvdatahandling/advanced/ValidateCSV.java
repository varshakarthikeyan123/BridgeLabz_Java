package ioprogramming.csvdatahandling.advanced;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {

    public static void main(String[] args) {

        Pattern emailPattern =
                Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

        Pattern phonePattern =
                Pattern.compile("\\d{10}");

        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {

            br.readLine(); // skip header
            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String email = data[2];
                String phone = data[3];

                if (!emailPattern.matcher(email).matches()
                        || !phonePattern.matcher(phone).matches()) {

                    System.out.println("Invalid Row: " + line);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
