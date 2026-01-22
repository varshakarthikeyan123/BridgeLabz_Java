package datastructures.stackqueuesandhashmap.hashmapandhashfunction;
import java.util.*;
/*
Problem: Find all subarrays with zero sum in a given array.

Approach:
1. Use a HashMap to store cumulative sums as keys and list of indices as values.
2. Initialize the map with sum 0 and index -1 to handle subarrays starting from index 0.
3. Iterate through the array while maintaining the cumulative sum.
4. For each element:
   - Add it to the cumulative sum.
   - If the sum already exists in the map, it means the subarray(s) between previous indices+1 and current index have zero sum.
   - Print all such subarrays.
   - Add the current index to the list of indices for the current sum in the map.
5. Continue until all elements are processed.

Time Complexity: O(N), where N is the size of the array.
Space Complexity: O(N) for storing cumulative sums and indices in the map.
*/

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Map to store cumulative sum and list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1))); // handle subarrays starting from index 0
        int sum = 0;

        System.out.println("Zero-sum subarrays (startIndex, endIndex):");
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum))
                    System.out.println("(" + (startIndex + 1) + ", " + i + ")");
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        sc.close();
    }
}
