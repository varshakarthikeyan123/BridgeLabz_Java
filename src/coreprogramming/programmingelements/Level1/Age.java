/*
 This program calculates the age of a person based on
 the given year of birth and the current year.
 It demonstrates basic variable declaration,
 arithmetic operation, and output in Java.
*/

package CoreProgramming.programmingelements.Level1;

public class Age {

    public static void main(String[] args) { // main method where program execution starts

        int DOB = 2000; // stores the year of birth
        int currentYr = 2024; // stores the current year

        int age = currentYr - DOB; // calculates age by subtracting DOB from current year

        System.out.println("Harry's age in 2024 is: " + age); // prints the calculated age
    }
}
