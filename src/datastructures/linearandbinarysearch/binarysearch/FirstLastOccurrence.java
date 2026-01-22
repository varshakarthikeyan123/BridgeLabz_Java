package datastructures.linearandbinarysearch.binarysearch;
import java.util.Scanner;
public class FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find the first and last occurrence of a target element in a sorted array.

         Approach:
         - Use binary search to find the first occurrence:
             - If target is found, move search to left half (right = mid - 1)
         - Use binary search to find the last occurrence:
             - If target is found, move search to right half (left = mid + 1)
         - Return indices of first and last occurrence, or -1 if not found.
        */

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of sorted array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);

        sc.close();
    }

    // Function to find first occurrence of target
    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;     // possible first occurrence
                right = mid - 1;  // search left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Function to find last occurrence of target
    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;     // possible last occurrence
                left = mid + 1;   // search right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
