package datastructures.sortingalgorithms.bubblesort;
import java.util.Scanner;

public class BubbleSortMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of student marks in ascending order using Bubble Sort.

         Approach:
         - Traverse the array multiple times.
         - Compare adjacent elements and swap if needed.
         - Repeat until the array is fully sorted (no swaps needed).
        */

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) marks[i] = sc.nextInt();

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization: stop if no swaps in a pass
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // swap adjacent elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // array already sorted
        }

        System.out.println("Sorted marks (ascending):");
        for (int mark : marks) System.out.print(mark + " ");
        sc.close();
    }
}
