package datastructures.stackqueuesandhashmap.hashmapandhashfunction;
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Find the length of the longest consecutive elements sequence in an unsorted array.
         Approach:
         - Store all elements in a HashSet for O(1) lookups.
         - For each element, check if it is the start of a sequence (num-1 not in set).
         - If yes, count consecutive numbers from that element.
         - Keep track of the maximum length found.
        */

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLen = 0;

        for (int num : arr) {
            // check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                // count consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        System.out.println("Length of longest consecutive sequence: " + maxLen);
        sc.close();
    }
}
