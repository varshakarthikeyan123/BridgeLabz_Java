package datastructures.sortingalgorithms.countingsort;
import java.util.Scanner;

public class CountingSortAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Sort an array of students' ages (10 to 18) using Counting Sort.

         Approach:
         - Create a count array to store frequency of each age.
         - Compute cumulative frequency to determine positions.
         - Place elements in their correct positions in the output array.
        */

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter students' ages (10-18):");
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();

        int maxAge = 18, minAge = 10;
        int range = maxAge - minAge + 1;

        int[] count = new int[range]; // frequency array
        int[] output = new int[n];    // sorted array

        // Count occurrences of each age
        for (int age : ages) count[age - minAge]++;

        // Cumulative count
        for (int i = 1; i < range; i++) count[i] += count[i - 1];

        // Place elements in output array (stable sort)
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        System.out.println("Sorted students' ages (ascending):");
        for (int age : output) System.out.print(age + " ");
        sc.close();
    }
}
