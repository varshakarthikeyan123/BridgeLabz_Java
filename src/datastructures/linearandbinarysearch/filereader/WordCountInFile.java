package datastructures.linearandbinarysearch.filereader;
import java.io.*;
import java.util.Scanner;

public class WordCountInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Count how many times a specific word appears in a text file.

         Approach:
         - Create a FileReader and wrap it in BufferedReader.
         - Initialize a counter variable.
         - Read each line from the file.
         - Split the line into words and check for the target word.
         - Increment the counter whenever the word is found.
         - Print the final count.
        */

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String targetWord = sc.nextLine();

        int count = 0; // counter for occurrences

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // split by spaces
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
