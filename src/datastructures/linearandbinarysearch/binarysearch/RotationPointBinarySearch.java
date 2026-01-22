package datastructures.linearandbinarysearch.binarysearch;
import java.util.Scanner;

public class RotationPointBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find the index of the smallest element (rotation point) in a rotated sorted array using Binary Search.

         Approach:
         - Initialize left = 0 and right = n - 1.
         - While left < right:
             - Find mid = (left + right) / 2.
             - If arr[mid] > arr[right], smallest element is in the right half → left = mid + 1.
             - Else, smallest element is in the left half → right = mid.
         - When left == right, left points to the smallest element.
        */

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of rotated sorted array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int left = 0, right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1; // smallest is in right half
            } else {
                right = mid; // smallest is in left half including mid
            }
        }

        System.out.println("Index of smallest element (rotation point): " + left);
        System.out.println("Smallest element: " + arr[left]);
        sc.close();
    }
}
