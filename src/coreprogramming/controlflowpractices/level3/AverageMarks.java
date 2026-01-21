/*
 This program calculates the average marks of a student
 based on Physics, Chemistry, and Maths scores.
 It then assigns a grade according to the average marks
 using conditional statements.
*/
package coreprogramming.controlflowpractices.level3;
// Package declaration for Level 3 control flow practice programs

import java.util.Scanner;
// Scanner class is used to take input from the user

public class AverageMarks {
    // Main class definition

    public static void main(String[] args) {
        // Main method where program execution starts

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter physics marks: ");
        float physics = input.nextFloat();
        // Reading Physics marks from the user

        System.out.print("Enter chemistry marks: ");
        float chemistry = input.nextFloat();
        // Reading Chemistry marks from the user

        System.out.print("Enter maths marks: ");
        float math = input.nextFloat();
        // Reading Maths marks from the user

        float average = (physics + chemistry + math) / 3;
        // Calculating the average of the three subject marks

        // Checking average and assigning grade accordingly
        if (average >= 80) {
            System.out.println("Grade: A; Level 4, above agency-normalized standards");
            // Grade A for average 80 and above
        }
        else if (average >= 70 && average <= 79) {
            System.out.println("Grade: B; Level 3, at agency-normalized standards");
            // Grade B for average between 70 and 79
        }
        else if (average >= 60 && average <= 69) {
            System.out.println("Grade: C; Level 2, below, but approaching agency-normalized standards");
            // Grade C for average between 60 and 69
        }
        else if (average >= 50 && average <= 59) {
            System.out.println("Grade: D; Level 1, well below agency-normalized standards");
            // Grade D for average between 50 and 59
        }
        else if (average >= 40 && average <= 49) {
            System.out.println("Grade: E; Level 1-, too below agency-normalized standards");
            // Grade E for average between 40 and 49
        }
        else {
            System.out.println("Grade: R; Remedial standards");
            // Grade R indicates remedial performance and need for improvement
        }
    }
}
