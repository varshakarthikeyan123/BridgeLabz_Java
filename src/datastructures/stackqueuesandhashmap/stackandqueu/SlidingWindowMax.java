package datastructures.stackqueuesandhashmap.stackandqueu;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
/*
Problem: Sliding Window Maximum

Approach:
1. Given an array and window size k, find the maximum in each sliding window.
2. Use a Deque to store indices of useful elements:
   - Elements in the deque are always in decreasing order.
   - The front of the deque contains the index of the maximum element for the current window.
3. For each element arr[i]:
   - Remove indices from the front if they are out of the current window (i - k).
   - Remove elements from the back which are smaller than or equal to arr[i] (they cannot be maximum for future windows).
   - Add current index i to the back of the deque.
4. Once i >= k-1, the front of the deque gives the maximum of the current window.
5. Time Complexity: O(N) since each element is added and removed at most once.
6. Space Complexity: O(k) for the deque.

Key Idea:
- Maintain a deque of indices that are potential maximums for the current and future windows.
- Efficiently gives maximum for each window in linear time.
*/

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>(); // stores indices
        for (int i = 0; i < n; i++) {
            // remove indices out of window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();

            // remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) dq.pollLast();

            dq.offerLast(i);

            // print max for window
            if (i >= k - 1) System.out.print(arr[dq.peekFirst()] + " ");
        }
        sc.close();
    }
}
