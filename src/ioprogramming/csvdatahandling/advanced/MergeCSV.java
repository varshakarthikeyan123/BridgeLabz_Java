package ioprogramming.csvdatahandling.advanced;

import java.io.*;
import java.util.*;

public class MergeCSV {

    public static void main(String[] args) {

        Map<String, String[]> map = new HashMap<>();

        try (
                BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
                BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("merged.csv"))
        ) {

            br1.readLine();
            String line;

            while ((line = br1.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], data);
            }

            br2.readLine();
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            while ((line = br2.readLine()) != null) {
                String[] data2 = line.split(",");
                String id = data2[0];

                if (map.containsKey(id)) {
                    String[] data1 = map.get(id);
                    bw.write(data1[0] + "," + data1[1] + "," + data1[2] + ","
                            + data2[1] + "," + data2[2]);
                    bw.newLine();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
