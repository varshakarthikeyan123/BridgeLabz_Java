package ioprogramming.csvdatahandling.advanced;

import java.io.*;

public class LargeCSVReader {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("large.csv"))) {

            br.readLine();
            String line;

            while ((line = br.readLine()) != null) {

                count++;

                if (count % 100 == 0) {
                    System.out.println("Processed: " + count + " records");
                }
            }

            System.out.println("Total Records: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
