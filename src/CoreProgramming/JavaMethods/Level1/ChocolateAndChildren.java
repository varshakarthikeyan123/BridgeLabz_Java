package CoreProgramming.JavaMethods.Level1;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class ChocolateAndChildren {

    // Method to calculate chocolates each child gets and chocolates left
    public static int[] childrenAndChocolate(int numberOfChocolates, int numberOfChildren) {

        int get = numberOfChocolates / numberOfChildren;
        // Calculating chocolates each child receives

        int left = numberOfChocolates % numberOfChildren;
        // Calculating remaining chocolates

        return new int[]{get, left};
        // Returning result as an array
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        // Reading number of children

        System.out.print("Enter number of chocolate: ");
        int numberOfChocolates = input.nextInt();
        // Reading number of chocolates

        int[] outPut = childrenAndChocolate(numberOfChocolates, numberOfChildren);
        // Calling method to get chocolates distribution

        System.out.println(
                "The number of chocolates received and remaining are: "
                        + outPut[1] + " and " + outPut[0]
        );
        // Printing remaining and received chocolates
    }
}
