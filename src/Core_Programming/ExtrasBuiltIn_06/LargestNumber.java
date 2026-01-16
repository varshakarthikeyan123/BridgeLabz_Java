package CoreProgramming.ExtrasBuiltIn;

import  java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();
        if ( number1 > number2 && number1 > number3){
            System.out.println("Is the first number " + number1 + " the largest? Yes");
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println("Is the second number " + number2 + " the largest? Yes");
        }
        else if (number3 > number1 && number3 > number2){
            System.out.println("Is the third number " + number3 + " the largest? Yes");
        }
        else{
            System.out.println("Out of the three entered numbers more than one number are equal.");
        }
    }
}
