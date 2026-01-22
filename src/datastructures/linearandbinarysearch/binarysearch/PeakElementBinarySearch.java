package datastructures.linearandbinarysearch.binarysearch;
import java.util.Scanner;

public class PeakElementBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find a peak element in an array (element greater than neighbors) using Binary Search.

         Approach:
         - Initialize left = 0 and right = n - 1.
         - While left <= right:
             - Find mid = (left + right) / 2.
             - Check if mid is a peak:
                 - If arr[mid] > arr[mid-1] and arr[mid] > arr[mid+1], return arr[mid].
             - If arr[mid] < arr[mid-1], move left: right = mid - 1.
             - If arr[mid] < arr[mid+1], move right: left = mid + 1.
        */

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int left = 0, right = n - 1;
        int peakIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                peakIndex = mid; // found a peak
                break;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1; // move left
            } else {
                left = mid + 1; // move right
            }
        }

        if (peakIndex != -1) {
            System.out.println("Peak element found at index " + peakIndex + ": " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }

        sc.close();
    }
}
