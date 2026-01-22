package datastructures.sortingalgorithms.mergesort;
import java.util.Scanner;

public class MergeSortBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of book prices in ascending order using Merge Sort.

         Approach:
         - Recursively divide the array into two halves.
         - Sort each half individually.
         - Merge the two sorted halves into a single sorted array.
        */

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted book prices (ascending):");
        for (int price : prices) System.out.print(price + " ");
        sc.close();
    }

    // Merge Sort function
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);       // sort left half
            mergeSort(arr, mid + 1, right);  // sort right half
            merge(arr, left, mid, right);    // merge sorted halves
        }
    }

    // Merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
