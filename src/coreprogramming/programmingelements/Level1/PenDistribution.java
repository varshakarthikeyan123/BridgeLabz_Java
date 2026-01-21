/*
 This program calculates how many pens each student gets
 when a fixed number of pens are distributed equally
 among a given number of students.
 It also calculates the number of pens left undistributed.
 The program demonstrates integer division, modulus
 operation, and output in Java.
*/

package CoreProgramming.programmingelements.Level1;

public class PenDistribution {

    public static void main(String[] args) { // main method where program execution starts

        int totalPens = 14; // stores the total number of pens
        int totalStudents = 3; // stores the total number of students

        int penDistribution = totalPens / totalStudents; // calculates pens per student using integer division
        int remainder = totalPens % totalStudents; // calculates remaining pens using modulus operator

        System.out.println(
                "The Pen per student is " + penDistribution
                        + " and the remaining pen not distributed is " + remainder + "."
        ); // displays distribution result
    }
}
