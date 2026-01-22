package datastructures.sortingalgorithms.heapsort;
import java.util.Scanner;

public class HeapSortSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of salary demands in ascending order using Heap Sort.

         Approach:
         - Build a Max Heap from the array.
         - Swap the root (largest) with the last element.
         - Reduce heap size by 1 and heapify the root.
         - Repeat until the array is fully sorted.
        */

        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        int[] salaries = new int[n];

        System.out.println("Enter salary demands:");
        for (int i = 0; i < n; i++) salaries[i] = sc.nextInt();

        heapSort(salaries);

        System.out.println("Sorted salary demands (ascending):");
        for (int sal : salaries) System.out.print(sal + " ");
        sc.close();
    }

    // Heap Sort function
    static void heapSort(int[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // swap root (largest) with end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index i for heap size n
    static void heapify(int[] arr, int n, int i) {
        int largest = i;        // initialize largest as root
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest); // recursively heapify affected subtree
        }
    }
}
