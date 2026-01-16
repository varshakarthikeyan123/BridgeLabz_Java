package CoreProgramming.StringFunctions.Level3;
import java.util.Scanner;
public class CharFrequencyUsingUnique {
    public static int stringLength(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
        return len;
    }

    public static char[] uniqueCharacters(String str) {
        int len = stringLength(str);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];
        int len = stringLength(str);
        for (int i = 0; i < len; i++) {
            freq[(int) str.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(str);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = Integer.toString(freq[(int) unique[i]]);
        }

        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] frequencyData = findFrequency(input);
        display(frequencyData);
    }
}
