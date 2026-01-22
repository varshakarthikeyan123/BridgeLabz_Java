package datastructures.stackqueuesandhashmap.hashmapandhashfunction;
import java.util.*;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Given an array and a target sum, check if there exists a pair
         of elements whose sum equals the target.
         Approach:
         - Use a HashSet to store numbers we've seen so far.
         - For each number x, check if (target - x) exists in the set.
         - If it exists, a pair is found.
         - Otherwise, add x to the set and continue.
        */

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Set<Integer> seen = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: (" + (target - num) + ", " + num + ")");
                found = true;
                break; // stop after finding one pair
            }
            seen.add(num);
        }

        if (!found) System.out.println("No pair found with the given sum.");

        sc.close();
    }
}
