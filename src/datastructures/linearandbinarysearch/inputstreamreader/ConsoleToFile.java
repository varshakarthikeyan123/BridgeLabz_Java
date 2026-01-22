package datastructures.linearandbinarysearch.inputstreamreader;
import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        /*
         Problem:
         Read user input from console and write each line to a file until "exit" is entered.

         Approach:
         - Create InputStreamReader to read from System.in.
         - Wrap it in BufferedReader for efficient reading.
         - Create a FileWriter to write to the file.
         - Read input using readLine() in a loop.
         - Write each line to the file.
         - Stop when user enters "exit".
         - Close the file and reader objects.
        */

        String filePath = "output.txt"; // output file path

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath, true); // append mode

            System.out.println("Enter text (type 'exit' to finish):");

            String input;
            while (true) {
                input = br.readLine();           // read input from console
                if ("exit".equalsIgnoreCase(input)) break;
                fw.write(input + System.lineSeparator()); // write to file
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Your input has been written to " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

