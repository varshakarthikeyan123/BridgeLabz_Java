package datastructures.linearandbinarysearch.linearseach;
import java.util.Scanner;

public class FirstNegativeLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find the first negative number in an integer array using Linear Search.

         Approach:
         - Iterate through the array from start to end.
         - Check if the current element is negative.
         - If found, return its index.
         - If no negative number is found, return -1.
        */

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int index = -1; // default if no negative number is found

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                index = i; // first negative found
                break;
            }
        }

        if (index != -1) {
            System.out.println("First negative number is at index: " + index);
        } else {
            System.out.println("No negative number found in the array.");
        }

        sc.close();
    }
}
