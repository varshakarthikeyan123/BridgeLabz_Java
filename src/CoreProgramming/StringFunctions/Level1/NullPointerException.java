/*
 This program demonstrates how a NullPointerException
 occurs in Java when an operation is performed on
 a null reference.
 It shows two cases:
 1) A method that generates NullPointerException.
 2) A method that handles NullPointerException using try-catch.
 The program helps understand null references
 and safe exception handling in Java.
*/

package CoreProgramming.StringFunctions.Level1;

public class NullPointerException {

    public static void nullPointerException() {

        String text = null; // initializes string reference with null
        System.out.println(text.length()); // causes NullPointerException
    }

    public static void handleNullPointerException() {

        String text = null; // initializes string reference with null

        try {
            System.out.println(text.length()); // attempts to access method on null reference
        }
        catch (java.lang.NullPointerException e) {
            // handles NullPointerException
            System.out.println("NullPointerException handled: text is null");
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        // nullPointerException(); // uncomment to see exception without handling
        handleNullPointerException(); // calls method that safely handles the exception
    }
}
