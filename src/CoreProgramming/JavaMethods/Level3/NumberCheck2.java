package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;

public class NumberCheck2 {

    // Method to count the number of digits in the given number
    public static int digitCount(int number){
        int count = 0;
        // Loop runs until number becomes 0, counting each digit
        while (number > 0){
            count++;
            number /= 10; // Removes the last digit
        }
        return count;
    }

    // Method to store digits of the number into an array
    public static int[] digitArray(int number, int count){
        int[] digit = new int[count];
        // Fill array from last index to preserve original digit order
        for (int i = count - 1; i >= 0; i--){
            digit[i] = number % 10; // Extract last digit
            number /= 10;           // Remove last digit
        }
        return digit;
    }

    // Method to calculate sum of digits
    public static int sumArray(int[] array){
        int sum = 0;
        // Add each digit to sum
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    // Method to calculate sum of squares of digits
    public static int squareArray(int[] array){
        int square = 0;
        // Square each digit and add to total
        for (int a : array){
            square += (int) Math.pow(a, 2);
        }
        return square;
    }

    // Method to check whether the number is a Harshad number
    public static boolean harshadNumber(int[] array, int number){
        int sum = 0;
        // Calculate sum of digits
        for (int a : array){
            sum += a;
        }
        // Harshad number if divisible by sum of digits
        if (number % sum == 0){
            return true;
        }
        return false;
    }

    // Method to calculate frequency of each digit (0–9)
    public static int[][] digitFrequency(int[] array){
        int[][] frequency = new int[10][2];

        // Initialize digit and its frequency
        for (int i = 0; i < 10; i++){
            frequency[i][0] = i; // Digit
            frequency[i][1] = 0; // Frequency
        }

        // Count frequency of each digit
        for (int a : array){
            frequency[a][1]++;
        }
        return frequency;
    }

    public static void main(String[] args){
        // Scanner object for user input
        Scanner input  = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter number: ");
        int number = input.nextInt();

        // Count digits
        int count = digitCount(number);

        // Convert number to digit array
        int[] digit = digitArray(number, count);

        // Check and display Harshad number result
        System.out.println("Is the number a harshad number: " + harshadNumber(digit, number));

        // Display sum of squares of digits
        System.out.println("Square sum of number: " + squareArray(digit));

        // Display sum of digits
        System.out.println("Sum of number: " + sumArray(digit));

        // Calculate digit frequency
        int[][] freq = digitFrequency(digit);

        // Display digit frequencies
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++){
            if (freq[i][1] > 0){
                System.out.println(freq[i][0] + "        " + freq[i][1]);
            }
        }
    }
}
