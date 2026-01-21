/*
 This program calculates the average marks of a student
 in three subjects: Maths, Physics, and Chemistry.
 It demonstrates the use of variables, arithmetic
 operations, and output statements in Java.
*/

package CoreProgramming.programmingelements.Level1;

public class AverageMarks {

    public static void main(String[] args) { // main method where program execution starts

        double Maths = 94; // stores marks obtained in Maths
        double Physics = 95; // stores marks obtained in Physics
        double Chemistry = 96; // stores marks obtained in Chemistry

        double average = (Maths + Physics + Chemistry) / 3; // calculates average of three subjects

        System.out.println("Sam's average mark in PCM is: " + average); // displays the average marks
    }
}
