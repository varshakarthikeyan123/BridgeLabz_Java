package datastructures.bigonotation;
import java.util.Arrays;
import java.util.Scanner;

public class SearchPerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Objective:
         Compare Linear Search (O(N)) and Binary Search (O(log N)) performance on different dataset sizes.

         Approach:
         - Linear Search: Scan each element until target is found.
         - Binary Search: Sort array first, then perform binary search.
         - Measure execution time using System.nanoTime().
        */

        System.out.print("Enter size of dataset: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Fill the array with numbers 1 to n
        for (int i = 0; i < n; i++) arr[i] = i + 1;

        System.out.print("Enter target element to search: ");
        int target = sc.nextInt();

        // --- Linear Search ---
        long startLinear = System.nanoTime();
        int linearIndex = linearSearch(arr, target);
        long endLinear = System.nanoTime();
        double linearTime = (endLinear - startLinear) / 1e6; // in milliseconds

        // --- Binary Search ---
        Arrays.sort(arr); // ensure array is sorted
        long startBinary = System.nanoTime();
        int binaryIndex = binarySearch(arr, target);
        long endBinary = System.nanoTime();
        double binaryTime = (endBinary - startBinary) / 1e6; // in milliseconds

        // --- Display Results ---
        System.out.println("\nResults:");
        System.out.println("Linear Search: Index = " + linearIndex + ", Time = " + linearTime + " ms");
        System.out.println("Binary Search: Index = " + binaryIndex + ", Time = " + binaryTime + " ms");

        sc.close();
    }

    // Linear Search function
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // not found
    }

    // Binary Search function
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // not found
    }
}
