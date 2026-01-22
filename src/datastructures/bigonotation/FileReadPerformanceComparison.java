package datastructures.bigonotation;
import java.io.*;
import java.util.Scanner;

public class FileReadPerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Objective:
         Compare performance of FileReader (character stream) and InputStreamReader (byte stream)
         when reading large files.

         Approach:
         - FileReader: reads character by character
         - InputStreamReader: reads bytes and converts to characters
        */

        System.out.print("Enter file path to read: ");
        String filePath = sc.nextLine();

        // --- Using FileReader ---
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            long startFR = System.nanoTime();
            while (br.read() != -1) { /* reading all characters */ }
            long endFR = System.nanoTime();
            double timeFR = (endFR - startFR) / 1e6; // ms

            br.close();
            fr.close();

            System.out.println("FileReader time: " + timeFR + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }

        // --- Using InputStreamReader ---
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br2 = new BufferedReader(isr);

            long startISR = System.nanoTime();
            while (br2.read() != -1) { /* reading all characters */ }
            long endISR = System.nanoTime();
            double timeISR = (endISR - startISR) / 1e6; // ms

            br2.close();
            isr.close();
            fis.close();

            System.out.println("InputStreamReader time: " + timeISR + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }

        sc.close();
    }
}
