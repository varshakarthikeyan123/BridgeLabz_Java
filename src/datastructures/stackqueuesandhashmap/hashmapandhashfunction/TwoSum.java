package datastructures.stackqueuesandhashmap.hashmapandhashfunction;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Given an array and a target sum, find indices of two numbers
         such that they add up to the target.

         Approach:
         - Use a HashMap to store numbers and their indices.
         - For each number x, check if (target - x) exists in the map.
         - If yes, return indices.
        */

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>(); // number -> index
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                found = true;
                break; // stop after finding first pair
            }
            map.put(arr[i], i);
        }

        if (!found) System.out.println("No such pair exists.");
        sc.close();
    }
}
