/*
 This program generates a grade card for multiple students
 based on their Physics, Chemistry, and Maths (PCM) scores.
 It randomly generates marks, calculates total, average,
 percentage, assigns grades, and displays a formatted
 score card.
 The program demonstrates use of 2D arrays, methods,
 random number generation, calculations, and formatted output in Java.
*/

package coreprogramming.stringfunctions.Level2;

import java.util.Scanner; // imports Scanner class for user input

public class StudentGradeCard {

    public static int[][] generatePCMScores(int students) {

        int[][] scores = new int[students][3]; // creates 2D array for PCM scores

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 100); // generates Physics marks
            scores[i][1] = (int) (Math.random() * 100); // generates Chemistry marks
            scores[i][2] = (int) (Math.random() * 100); // generates Maths marks
        }
        return scores; // returns generated scores
    }

    public static double[][] calculateResults(int[][] scores) {

        int students = scores.length; // gets number of students
        double[][] result = new double[students][3]; // stores total, average, percentage

        for (int i = 0; i < students; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2]; // calculates total marks
            double average = total / 3.0; // calculates average
            double percentage = (total / 300.0) * 100; // calculates percentage

            result[i][0] = total; // stores total
            result[i][1] = Math.round(average * 100.0) / 100.0; // rounds average to 2 decimals
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // rounds percentage to 2 decimals
        }
        return result; // returns calculated results
    }

    public static String[] calculateGrades(double[][] results) {

        int students = results.length; // gets number of students
        String[] grades = new String[students]; // stores grades

        for (int i = 0; i < students; i++) {

            double percent = results[i][2]; // gets percentage

            if (percent >= 80)
                grades[i] = "A"; // assigns grade A
            else if (percent >= 70)
                grades[i] = "B"; // assigns grade B
            else if (percent >= 60)
                grades[i] = "C"; // assigns grade C
            else if (percent >= 50)
                grades[i] = "D"; // assigns grade D
            else if (percent >= 40)
                grades[i] = "E"; // assigns grade E
            else
                grades[i] = "R"; // assigns R (Reappear)
        }
        return grades; // returns grades array
    }

    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {

        System.out.println("\nScore Card");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" + // Physics marks
                    scores[i][1] + "\t" + // Chemistry marks
                    scores[i][2] + "\t" + // Maths marks
                    (int) results[i][0] + "\t" + // total marks
                    results[i][1] + "\t" + // average
                    results[i][2] + "\t" + // percentage
                    grades[i]); // grade
        }
    }

    public static void main(String[] args) { // main method where execution starts

        Scanner sc = new Scanner(System.in); // creates Scanner object

        System.out.print("Enter number of students: "); // prompts user for student count
        int students = sc.nextInt(); // reads number of students

        int[][] scores = generatePCMScores(students); // generates PCM scores
        double[][] results = calculateResults(scores); // calculates totals, averages, percentages
        String[] grades = calculateGrades(results); // assigns grades

        displayScoreCard(scores, results, grades); // displays final score card
    }
}
