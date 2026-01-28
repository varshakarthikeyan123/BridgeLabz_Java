package javacollectionstreams.collections;

import java.util.*;

/*
 * This program finds the union and intersection of two sets.
 * HashSet is used to avoid duplicate elements.
 */

public class SetOperations {

    public static void main(String[] args) {

        // Creating first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Creating second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union of sets
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection of sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Printing results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}

