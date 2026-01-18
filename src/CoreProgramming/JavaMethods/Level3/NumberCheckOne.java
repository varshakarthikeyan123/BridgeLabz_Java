/*
 This package CoreProgramming.JavaMethods.Level3 contains programs that use
 Java methods to solve advanced mathematical and number-based problems.
 This program checks various properties of a number such as Duck number,
 Armstrong number, largest/smallest digits, etc., using modular methods.
*/
package CoreProgramming.JavaMethods.Level3;

import java.util.Scanner;
// Scanner is used to take input from the user

public class NumberCheck1 {

    // Method to count the number of digits in a given number
    public static int digitCount(int number) {
        // Special case: if number is 0, it has one digit
        if (number == 0) {
            return 1;
        }

        int count = 0;
        // Variable to store digit count

        // Loop until number becomes 0
        while (number > 0) {
            count++;
            // Increment digit count
            number /= 10;
            // Remove the last digit
        }
        return count;
        // Return total number of digits
    }

    // Method to store digits of a number into an array
    public static int[] digitArray(int count, int number) {

        int[] digit = new int[count];
        // Array to store digits of the number

        // Fill array from last index to maintain original order
        for (int i = count - 1; i >= 0; i--) {
            digit[i] = number % 10;
            // Extract last digit
            number /= 10;
            // Remove last digit
        }
        return digit;
        // Return digit array
    }

    // Method to check whether the number is a Duck Number
    // A Duck number contains at least one zero (not as the first digit)
    public static boolean duckNUmber(int[] digit) {

        // Start from index 1 to avoid leading zero case
        for (int i = 1; i < digit.length; i++) {
            if (digit[i] == 0) {
                return true;
                // Zero found, it is a Duck number
            }
        }
        return false;
        // No zero found
    }

    // Method to check whether the number is an Armstrong number
    public static boolean armstrongNumber(int[] digit, int number) {

        int sum = 0;
        // Variable to store sum of powered digits

        int power = digit.length;
        // Power equals number of digits

        // Loop through each digit
        for (int d : digit) {
            sum += (int) Math.pow(d, power);
            // Add digit raised to power
        }

        return sum == number;
        // Return true if Armstrong condition is satisfied
    }

    // Method to find the largest and second largest digit
    public static int[] largestElement(int[] digit) {

        int largest = Integer.MIN_VALUE;
        // Stores largest digit

        int secondLargest = Integer.MIN_VALUE;
        // Stores second largest digit

        // Traverse through digit array
        for (int d : digit) {
            if (d > largest) {
                secondLargest = largest;
                // Update second largest
                largest = d;
                // Update largest
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
                // Update second largest if condition matches
            }
        }

        // Handle case when all digits are same
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = largest;
        }

        return new int[]{largest, secondLargest};
        // Return largest and second largest digits
    }

    // Method to find the smallest and second smallest digit
    public static int[] smallestElement(int[] digit) {

        int smallest = Integer.MAX_VALUE;
        // Stores smallest digit

        int secondSmallest = Integer.MAX_VALUE;
        // Stores second smallest digit

        // Traverse through digit array
        for (int d : digit) {
            if (d < smallest) {
                secondSmallest = smallest;
                // Update second smallest
                smallest = d;
                // Update smallest
            } else if (d > smallest && d < secondSmallest) {
                secondSmallest = d;
                // Update second smallest if condition matches
            }
        }

        // Handle case when all digits are same
        if (secondSmallest == Integer.MAX_VALUE) {
            secondSmallest = smallest;
        }

        return new int[]{smallest, secondSmallest};
        // Return smallest and second smallest digits
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        // Reading the number

        int count = digitCount(number);
        // Counting digits in the number

        int[] digits = digitArray(count, number);
        // Converting number into digit array

        System.out.println("Duck Number: " + duckNUmber(digits));
        // Printing Duck number result

        System.out.println("Armstrong Number: " + armstrongNumber(digits, number));
        // Printing Armstrong number result

        int[] max = largestElement(digits);
        // Finding largest and second largest digit
        System.out.println("Largest: " + max[0] + ", Second Largest: " + max[1]);
        // Printing largest and second largest digits

        int[] min = smallestElement(digits);
        // Finding smallest and second smallest digit
        System.out.println("Smallest: " + min[0] + ", Second Smallest: " + min[1]);
        // Printing smallest and second smallest digits
    }
}
