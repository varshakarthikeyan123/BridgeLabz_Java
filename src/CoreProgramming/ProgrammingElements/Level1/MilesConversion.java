/*
 This program converts a fixed distance from kilometers
 to miles using a constant multiplier.
 It demonstrates the use of constants (final keyword),
 arithmetic calculation, and output statements in Java.
*/

package CoreProgramming.ProgrammingElements.Level1;

public class MilesConversion {

    public static void main(String[] args) { // main method where program execution starts

        double Km = 10.8; // stores the distance in kilometers
        final double multiplier = 1.6; // constant value used for conversion

        double miles = Km * multiplier; // converts kilometers to miles

        System.out.println(
                "The distance of " + Km + " km in miles is: " + miles + " mi."
        ); // displays the converted distance
    }
}
