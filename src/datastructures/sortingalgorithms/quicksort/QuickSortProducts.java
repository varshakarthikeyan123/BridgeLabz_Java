package datastructures.sortingalgorithms.quicksort;
import java.util.Scanner;

public class QuickSortProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of product prices in ascending order using Quick Sort.

         Approach:
         - Pick a pivot element (here, we use the last element).
         - Partition the array: elements smaller than pivot on left, larger on right.
         - Recursively apply Quick Sort on left and right partitions.
        */

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted product prices (ascending):");
        for (int price : prices) System.out.print(price + " ");
        sc.close();
    }

    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // pivot index
            quickSort(arr, low, pi - 1);        // sort left
            quickSort(arr, pi + 1, high);       // sort right
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing last element as pivot
        int i = low - 1;       // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }
}
