package datastructures.sortingalgorithms.selectionsort;
import java.util.Scanner;

public class SelectionSortScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of students' exam scores in ascending order using Selection Sort.

         Approach:
         - Traverse the array to find the minimum element in the unsorted part.
         - Swap it with the first unsorted element.
         - Repeat for the remaining elements until the array is fully sorted.
        */

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        // Selection Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) minIndex = j;
            }

            // swap the found minimum element with the first unsorted element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Sorted exam scores (ascending):");
        for (int score : scores) System.out.print(score + " ");
        sc.close();
    }
}
