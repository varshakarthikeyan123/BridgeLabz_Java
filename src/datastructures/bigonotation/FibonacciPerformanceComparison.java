package datastructures.bigonotation;
import java.util.Scanner;

public class FibonacciPerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Objective:
         Compare performance of Recursive (O(2^N)) and Iterative (O(N)) Fibonacci implementations.

         Approach:
         - Recursive: simple, but exponential time.
         - Iterative: linear time, memory-efficient.
         - Measure execution time using System.nanoTime().
        */

        System.out.print("Enter N (Fibonacci term to calculate): ");
        int n = sc.nextInt();

        // --- Recursive Fibonacci ---
        long startRec = System.nanoTime();
        int fibRec = fibonacciRecursive(n);
        long endRec = System.nanoTime();
        double timeRec = (endRec - startRec) / 1e6; // ms

        // --- Iterative Fibonacci ---
        long startIter = System.nanoTime();
        int fibIter = fibonacciIterative(n);
        long endIter = System.nanoTime();
        double timeIter = (endIter - startIter) / 1e6; // ms

        // --- Display Results ---
        System.out.println("\nFibonacci Results:");
        System.out.println("Recursive: " + fibRec + ", Time = " + timeRec + " ms");
        System.out.println("Iterative: " + fibIter + ", Time = " + timeIter + " ms");

        sc.close();
    }

    // Recursive Fibonacci
    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
