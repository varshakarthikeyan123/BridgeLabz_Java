/*
 This program performs various MATRIX OPERATIONS using methods.
 It demonstrates:
 1) Creation of random matrices
 2) Displaying matrices
 3) Matrix addition and subtraction
 4) Matrix multiplication
 5) Matrix transpose
 6) Determinant calculation (2x2 and 3x3)
 7) Inverse of matrices (2x2 and 3x3)

 The program uses double data type for precision
 and Random class to generate matrix values.
*/
package CoreProgramming.JavaMethods.Level3;

import java.util.Random;

public class Matrix {

    // Method to create a matrix with random values between 1 and 10
    public static double[][] createRandomMatrix(int rows, int cols) {

        Random rand = new Random();
        // Random object to generate random numbers

        double[][] matrix = new double[rows][cols];
        // Creating a matrix of given size

        // Filling the matrix with random integers (1 to 10)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }

        return matrix;
        // Returning the generated matrix
    }

    // Method to display a matrix neatly
    public static void displayMatrix(double[][] matrix) {

        // Loop through rows
        for (double[] row : matrix) {

            // Loop through columns
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }

            // Move to next line after each row
            System.out.println();
        }
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        double[][] result = new double[rows][cols];
        // Matrix to store addition result

        // Element-wise addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
        // Returning added matrix
    }

    // Method to subtract matrix B from matrix A
    public static double[][] subtractMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = A[0].length;

        double[][] result = new double[rows][cols];
        // Matrix to store subtraction result

        // Element-wise subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
        // Returning subtracted matrix
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] A, double[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        double[][] result = new double[rows][cols];
        // Matrix to store multiplication result

        // Standard matrix multiplication logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
        // Returning multiplied matrix
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] A) {

        int rows = A.length;
        int cols = A[0].length;

        double[][] transposed = new double[cols][rows];
        // Transposed matrix has swapped rows and columns

        // Swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = A[i][j];
            }
        }

        return transposed;
        // Returning transposed matrix
    }

    // Method to calculate determinant of a 2x2 matrix
    public static double determinant2x2(double[][] A) {

        // Formula: ad - bc
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    // Method to calculate determinant of a 3x3 matrix
    public static double determinant3x3(double[][] A) {

        // Using cofactor expansion
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
                - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
                + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    // Method to calculate inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] A) {

        double det = determinant2x2(A);
        // Determinant of matrix

        // If determinant is zero, inverse does not exist
        if (det == 0) return null;

        // Applying inverse formula
        double[][] inverse = {
                {  A[1][1] / det, -A[0][1] / det },
                { -A[1][0] / det,  A[0][0] / det }
        };

        return inverse;
        // Returning inverse matrix
    }

    // Method to calculate inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] A) {

        double det = determinant3x3(A);
        // Determinant of matrix

        // If determinant is zero, inverse does not exist
        if (det == 0) return null;

        double[][] adj = new double[3][3];
        // Adjugate matrix

        // Calculating cofactors
        adj[0][0] =  (A[1][1] * A[2][2] - A[1][2] * A[2][1]);
        adj[0][1] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]);
        adj[0][2] =  (A[0][1] * A[1][2] - A[0][2] * A[1][1]);

        adj[1][0] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]);
        adj[1][1] =  (A[0][0] * A[2][2] - A[0][2] * A[2][0]);
        adj[1][2] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]);

        adj[2][0] =  (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
        adj[2][1] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]);
        adj[2][2] =  (A[0][0] * A[1][1] - A[0][1] * A[1][0]);

        double[][] inverse = new double[3][3];
        // Inverse matrix

        // Transposing adjugate and dividing by determinant
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[j][i] / det;
            }
        }

        return inverse;
        // Returning inverse matrix
    }

    public static void main(String[] args) {

        // Creating two random 3x3 matrices
        double[][] A = createRandomMatrix(3, 3);
        double[][] B = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        // Inverse of matrix A
        double[][] invA = inverse3x3(A);
        if (invA != null) {
            System.out.println("\nInverse of A:");
            displayMatrix(invA);
        } else {
            System.out.println("\nMatrix A is singular. Inverse does not exist.");
        }

        // Example with 2x2 matrix
        double[][] C = createRandomMatrix(2, 2);
        System.out.println("\nMatrix C:");
        displayMatrix(C);

        System.out.println("Determinant of C: " + determinant2x2(C));

        double[][] invC = inverse2x2(C);
        if (invC != null) {
            System.out.println("Inverse of C:");
            displayMatrix(invC);
        } else {
            System.out.println("Matrix C is singular. Inverse does not exist.");
        }
    }
}
