package javacollectionstreams.collections;

import java.util.*;

/*
 * This program reverses a list without using built-in reverse methods.
 * It works for both ArrayList and LinkedList by swapping elements manually.
 */

public class ReverseList {

    public static void main(String[] args) {

        // Creating an ArrayList
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Reversing list manually
        int start = 0;
        int end = list.size() - 1;

        // Loop until middle is reached
        while (start < end) {

            // Swapping elements
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            // Move pointers
            start++;
            end--;
        }

        // Printing reversed list
        System.out.println(list);
    }
}

