package CoreProgramming.StringFunctions.Level3;
import java.util.Scanner;
public class CharacterFrequency {
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256]; // Array to store frequency of ASCII characters
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            freq[(int) ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); // Character
                result[index][1] = Integer.toString(freq[i]);    // Frequency
                index++;
            }
        }

        return result;
    }
    public static void displayFrequency(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqData = findCharFrequency(input);

        displayFrequency(freqData);
    }
}

