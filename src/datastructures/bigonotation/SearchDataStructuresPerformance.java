package datastructures.bigonotation;
import java.util.*;

public class SearchDataStructuresPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Objective:
         Compare search performance using Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)).

         Approach:
         - Array: linear search
         - HashSet: hash-based lookup
         - TreeSet: balanced BST lookup
         - Measure execution time using System.nanoTime().
        */

        System.out.print("Enter dataset size: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill all data structures with numbers 0 to n-1
        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        // --- Array Linear Search ---
        long startArray = System.nanoTime();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { index = i; break; }
        }
        long endArray = System.nanoTime();
        double timeArray = (endArray - startArray) / 1e6;

        // --- HashSet Search ---
        long startHash = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        long endHash = System.nanoTime();
        double timeHash = (endHash - startHash) / 1e6;

        // --- TreeSet Search ---
        long startTree = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        long endTree = System.nanoTime();
        double timeTree = (endTree - startTree) / 1e6;

        // --- Display Results ---
        System.out.println("\nSearch Performance Results (Time in ms):");
        System.out.println("Array (Linear Search): " + timeArray + " ms, Found = " + (index != -1));
        System.out.println("HashSet (O(1) avg): " + timeHash + " ms, Found = " + foundHash);
        System.out.println("TreeSet (O(log N)): " + timeTree + " ms, Found = " + foundTree);

        sc.close();
    }
}
