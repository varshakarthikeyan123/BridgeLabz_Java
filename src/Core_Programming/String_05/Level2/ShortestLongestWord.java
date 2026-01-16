package CoreProgramming.StringFunctions.Level2;
import java.util.Scanner;
public class ShortestLongestWord {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
        return count;
    }

    public static String[] customSplit(String text) {

        int length = findLength(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if ((i == 0 && text.charAt(i) != ' ') ||
                    (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(table[0][1]);
        int longestLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = createWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("\nWord \t Length");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " \t " + Integer.parseInt(table[i][1]));
        }
        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }
}
