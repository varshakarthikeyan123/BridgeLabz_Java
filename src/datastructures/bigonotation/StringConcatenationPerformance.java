package datastructures.bigonotation;
import java.util.Scanner;

public class StringConcatenationPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Objective:
         Compare performance of String, StringBuilder, and StringBuffer
         when concatenating large numbers of strings.

         Approach:
         - String: Immutable, creates new object each concatenation (O(N^2))
         - StringBuilder: Mutable, fast, not thread-safe (O(N))
         - StringBuffer: Mutable, thread-safe, slightly slower (O(N))
        */

        System.out.print("Enter number of strings to concatenate: ");
        int n = sc.nextInt();

        String str = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf = new StringBuffer();

        // --- Measure String concatenation ---
        long startString = System.nanoTime();
        for (int i = 0; i < n; i++) {
            str += "x"; // creates new object each time
        }
        long endString = System.nanoTime();
        double timeString = (endString - startString) / 1e6; // ms

        // --- Measure StringBuilder concatenation ---
        long startBuilder = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("x");
        }
        long endBuilder = System.nanoTime();
        double timeBuilder = (endBuilder - startBuilder) / 1e6; // ms

        // --- Measure StringBuffer concatenation ---
        long startBuffer = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuf.append("x");
        }
        long endBuffer = System.nanoTime();
        double timeBuffer = (endBuffer - startBuffer) / 1e6; // ms

        // --- Display Results ---
        System.out.println("\nConcatenation Performance Results (Time in ms):");
        System.out.println("String: " + timeString);
        System.out.println("StringBuilder: " + timeBuilder);
        System.out.println("StringBuffer: " + timeBuffer);

        sc.close();
    }
}
