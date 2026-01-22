package datastructures.linearandbinarysearch.stringbuffer;
import java.util.Scanner;

public class StringBufferVsBuilderInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Compare performance of StringBuffer and StringBuilder for concatenating strings.

         Approach:
         - Take user input for number of strings to concatenate.
         - Append that many strings to both StringBuffer and StringBuilder.
         - Measure execution time using System.nanoTime().
         - Output the time taken for both.
        */

        System.out.print("Enter number of strings to concatenate: ");
        int n = sc.nextInt();

        System.out.print("Enter the string to concatenate: ");
        sc.nextLine(); // consume leftover newline
        String sample = sc.nextLine();

        // --- Using StringBuffer ---
        StringBuffer sbuf = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < n; i++) sbuf.append(sample);
        long endTime1 = System.nanoTime();
        long timeSBuffer = endTime1 - startTime1;

        // --- Using StringBuilder ---
        StringBuilder sbuilder = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < n; i++) sbuilder.append(sample);
        long endTime2 = System.nanoTime();
        long timeSBuilder = endTime2 - startTime2;

        System.out.println("\nTime taken by StringBuffer (ns): " + timeSBuffer);
        System.out.println("Time taken by StringBuilder (ns): " + timeSBuilder);
        sc.close();
    }
}
