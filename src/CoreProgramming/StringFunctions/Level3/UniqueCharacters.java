package CoreProgramming.StringFunctions.Level3;
import java.util.Scanner;
public class UniqueCharacters {
    public static int stringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return length;
    }
    public static char[] findUniqueChars(String str) {
        int len = stringLength(str);
        char[] unique = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < count; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[count] = ch;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] uniqueChars = findUniqueChars(input);
        System.out.print("Unique characters: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
    }
}
