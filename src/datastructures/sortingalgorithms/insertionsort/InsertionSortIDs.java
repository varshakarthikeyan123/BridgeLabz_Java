package datastructures.sortingalgorithms.insertionsort;
import java.util.Scanner;

public class InsertionSortIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of employee IDs in ascending order using Insertion Sort.

         Approach:
         - Divide the array into sorted and unsorted parts.
         - Pick an element from the unsorted part.
         - Insert it into its correct position in the sorted part.
         - Repeat for all elements until the array is sorted.
        */

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int[] empIDs = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) empIDs[i] = sc.nextInt();

        // Insertion Sort algorithm
        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;

            // move elements greater than key one position ahead
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
            empIDs[j + 1] = key; // insert key at correct position
        }

        System.out.println("Sorted Employee IDs (ascending):");
        for (int id : empIDs) System.out.print(id + " ");
        sc.close();
    }
}
