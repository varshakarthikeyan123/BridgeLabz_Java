package datastructures.linearandbinarysearch.filereader;
import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        /*
         Problem:
         Read a text file line by line and print each line to the console.

         Approach:
         - Create a FileReader object for the file.
         - Wrap it with BufferedReader to read lines efficiently.
         - Use a loop to read each line using readLine().
         - Print each line to the console.
         - Close the BufferedReader after reading.
        */

        String filePath = "example.txt"; // replace with your file path

        try {
            FileReader fr = new FileReader(filePath);        // read the file
            BufferedReader br = new BufferedReader(fr);      // buffer for efficient reading

            String line;
            while ((line = br.readLine()) != null) {         // read each line
                System.out.println(line);                    // print the line
            }

            br.close();  // close BufferedReader
            fr.close();  // close FileReader
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
