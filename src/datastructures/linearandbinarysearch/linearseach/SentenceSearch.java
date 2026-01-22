package datastructures.linearandbinarysearch.linearseach;
import java.util.Scanner;
public class SentenceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find the first sentence in an array that contains a specific word using Linear Search.

         Approach:
         - Iterate through the array of sentences.
         - For each sentence, check if it contains the target word.
         - If found, return the sentence.
         - If no sentence contains the word, return "Not Found".
        */

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) sentences[i] = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String targetWord = sc.nextLine();

        String result = "Not Found";

        for (String sentence : sentences) {
            if (sentence.contains(targetWord)) {
                result = sentence; // first sentence containing the word
                break;
            }
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
