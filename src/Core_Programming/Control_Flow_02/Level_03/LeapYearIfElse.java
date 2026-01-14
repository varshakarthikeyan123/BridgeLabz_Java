package Core_Programming.Control_Flow_02.Level_03;

import java.util.Scanner;

public class LeapYearIfElse {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int year = input.nextInt();

            if (year >= 1582) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is not a Leap Year");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            } else {
                System.out.println("Year must be 1582 or later");
            }
        }
    }

