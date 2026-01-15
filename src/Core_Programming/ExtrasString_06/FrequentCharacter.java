package CoreProgramming.Extras;
import java.util.Scanner;
public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        int count = 0;
        int maxCount = 0;
        char mostFrequent = ' ';
        for   (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (text.charAt(i) == ch) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }
        System.out.println("Most frequent character: '" + mostFrequent + "'");

    }
}
