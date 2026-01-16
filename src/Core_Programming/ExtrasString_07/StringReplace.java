package CoreProgramming.Extras;
import  java.util.Scanner;
public class StringReplace {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.equals(oldWord)) {
                    result += newWord;
                } else {
                    result += word;
                }
                result += " ";
                word = "";
            }
        }

        if (word.equals(oldWord)) {
            result += newWord;
        } else {
            result += word;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = input.next();

        System.out.print("Enter the new word: ");
        String newWord = input.next();

        String replacedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + replacedSentence);

    }
}


