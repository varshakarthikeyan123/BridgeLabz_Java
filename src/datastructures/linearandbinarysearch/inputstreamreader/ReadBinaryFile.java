package datastructures.linearandbinarysearch.inputstreamreader;
import java.io.*;
import java.util.Scanner;

public class ReadBinaryFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Read binary data from a file and print it as characters using InputStreamReader.

         Approach:
         - Create a FileInputStream to read bytes from the file.
         - Wrap it with InputStreamReader to decode bytes into characters.
         - Wrap InputStreamReader with BufferedReader for efficient reading.
         - Read the file line by line and print each line.
         - Handle exceptions appropriately.
        */

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter charset (e.g., UTF-8): ");
        String charset = sc.nextLine();

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, charset); // decode bytes
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // print each line
            }

            br.close();
            isr.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
