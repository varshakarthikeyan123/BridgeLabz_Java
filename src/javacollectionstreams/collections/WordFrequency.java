package javacollectionstreams.collections;

import java.util.*;

/*
 * This program counts the frequency of words in a sentence.
 * HashMap is used to store word-frequency pairs.
 */

public class WordFrequency {

    public static void main(String[] args) {

        // Input string
        String text = "Hello world hello Java";

        // Convert to lowercase and split words
        String[] words = text.toLowerCase().split(" ");

        // Creating HashMap
        Map<String, Integer> map = new HashMap<>();

        // Counting frequency
        for (String word : words) {

            // If word exists, increase count
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Printing word frequencies
        System.out.println(map);
    }
}

