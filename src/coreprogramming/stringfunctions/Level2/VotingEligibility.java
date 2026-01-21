/*
 This program checks the voting eligibility of students
 based on their age.
 It collects ages for a fixed number of students,
 determines whether each student is eligible to vote,
 and displays the results in a tabular format.
 The program demonstrates use of arrays, methods,
 conditional logic, and formatted output in Java.
*/

package coreprogramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class to take input from the user

public class VotingEligibility {

    public static int[] getStudentAges(int n, Scanner sc) {

        int[] ages = new int[n]; // array to store ages of students

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": "); // prompts user
            ages[i] = sc.nextInt(); // reads age value
        }
        return ages; // returns array of ages
    }

    public static String[][] checkVotingEligibility(int[] ages) {

        int n = ages.length; // number of students
        String[][] result = new String[n][2]; // stores age and voting eligibility

        for (int i = 0; i < n; i++) {

            result[i][0] = String.valueOf(ages[i]); // stores age as string

            if (ages[i] < 0) {
                result[i][1] = "false"; // invalid age cannot vote
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // eligible to vote
            } else {
                result[i][1] = "false"; // not eligible to vote
            }
        }
        return result; // returns voting eligibility result
    }

    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]); // displays age and status
        }
    }

    public static void main(String[] args) { // main method where program execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object

        int numberOfStudents = 10; // fixed number of students

        int[] ages = getStudentAges(numberOfStudents, sc); // collects student ages
        String[][] votingStatus = checkVotingEligibility(ages); // checks voting eligibility
        displayResult(votingStatus); // displays final result
    }
}
