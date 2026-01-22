package datastructures.bigonotation;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingPerformanceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        /*
         Objective:
         Compare Bubble Sort (O(N^2)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)) performance.

         Approach:
         - Bubble Sort: repeated swapping of adjacent elements.
         - Merge Sort: divide & conquer.
         - Quick Sort: partition-based.
         - Measure execution time using System.nanoTime().
        */

        System.out.print("Enter size of dataset: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Fill array with random integers
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(n * 10);

        // --- Bubble Sort ---
        int[] bubbleArr = Arrays.copyOf(arr, n);
        long startBubble = System.nanoTime();
        bubbleSort(bubbleArr);
        long endBubble = System.nanoTime();
        double bubbleTime = (endBubble - startBubble) / 1e6; // in ms

        // --- Merge Sort ---
        int[] mergeArr = Arrays.copyOf(arr, n);
        long startMerge = System.nanoTime();
        mergeSort(mergeArr, 0, n - 1);
        long endMerge = System.nanoTime();
        double mergeTime = (endMerge - startMerge) / 1e6;

        // --- Quick Sort ---
        int[] quickArr = Arrays.copyOf(arr, n);
        long startQuick = System.nanoTime();
        quickSort(quickArr, 0, n - 1);
        long endQuick = System.nanoTime();
        double quickTime = (endQuick - startQuick) / 1e6;

        // --- Display Results ---
        System.out.println("\nSorting Performance Results (Time in ms):");
        System.out.println("Bubble Sort: " + bubbleTime);
        System.out.println("Merge Sort: " + mergeTime);
        System.out.println("Quick Sort: " + quickTime);

        sc.close();
    }

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[l + i];
        for (int i = 0; i < n2; i++) R[i] = arr[m + 1 + i];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}
