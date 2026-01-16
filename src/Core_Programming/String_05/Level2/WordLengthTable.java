package CoreProgramming.StringFunctions.Level2;
import java.util.Scanner;

public class WordLengthTable {

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
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (!word.equals("")) {
                words[wordIndex++] = word;
                word = "";
            }
        }

        if (!word.equals("")) {
            words[wordIndex] = word;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] result = createWordLengthTable(words);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + " \t " +length);
        }
    }
}
