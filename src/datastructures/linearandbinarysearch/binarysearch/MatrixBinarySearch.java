package datastructures.linearandbinarysearch.binarysearch;
import java.util.Scanner;

public class MatrixBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Problem:
         Search for a target value in a 2D matrix where:
         - Each row is sorted in ascending order.
         - First element of each row is greater than last of previous row.

         Approach:
         - Treat the matrix as a flattened 1D array.
         - Initialize left = 0, right = rows*cols - 1.
         - Perform binary search:
             - mid = (left + right) / 2
             - Convert mid to row and column: row = mid / cols, col = mid % cols
             - Compare matrix[row][col] with target
             - Adjust left/right accordingly
        */

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements row-wise:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int left = 0, right = rows * cols - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                found = true;
                break;
            } else if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Target found? " + found);
        sc.close();
    }
}
