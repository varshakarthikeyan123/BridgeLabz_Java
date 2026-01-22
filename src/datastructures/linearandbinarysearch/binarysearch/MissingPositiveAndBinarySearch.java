package datastructures.linearandbinarysearch.binarysearch;
import java.util.Arrays;
import java.util.Scanner;

public class MissingPositiveAndBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         1. Find the first missing positive integer using Linear Search approach.
         2. Find the index of a given target number using Binary Search.

         Approach:
         - For first missing positive:
             - Use extra array to mark visited positive numbers.
             - Traverse again to find the first positive number not marked.
         - For Binary Search:
             - Sort the array.
             - Perform binary search to find target index.
        */

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target number for Binary Search: ");
        int target = sc.nextInt();

        // --- Linear Search: Find first missing positive ---
        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        // --- Binary Search: Find target index ---
        Arrays.sort(arr); // sort array for binary search
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target " + target + " not found in array.");
        }

        sc.close();
    }

    // Function to find first missing positive integer
    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1]; // extra space to mark presence
        for (int num : arr) {
            if (num > 0 && num <= n) present[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) return i;
        }
        return n + 1; // all 1..n present
    }

    // Function to perform Binary Search
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
