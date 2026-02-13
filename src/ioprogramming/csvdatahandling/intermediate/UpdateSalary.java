package ioprogramming.csvdatahandling.intermediate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UpdateSalary {

    public static void main(String[] args) {

        try (
                BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"))
        ) {

            String header = br.readLine();
            bw.write(header);
            bw.newLine();

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]);
                    salary = salary * 1.10;
                    data[3] = String.valueOf(salary);
                }

                bw.write(String.join(",", data));
                bw.newLine();
            }

            System.out.println("Salary updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
