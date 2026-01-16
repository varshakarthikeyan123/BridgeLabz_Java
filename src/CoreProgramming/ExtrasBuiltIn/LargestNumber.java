package CoreProgramming.ExtrasBuiltIn;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        // Reading the first number

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        // Reading the second number

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        // Reading the third number

        // Checking if the first number is greater than the other two
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number " + number1 + " the largest? Yes");
        }
        // Checking if the second number is greater than the other two
        else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number " + number2 + " the largest? Yes");
        }
        // Checking if the third number is greater than the other two
        else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number " + number3 + " the largest? Yes");
        }
        // This case occurs when two or more numbers are equal
        else {
            System.out.println("Out of the three entered numbers more than one number are equal.");
        }
    }
}
