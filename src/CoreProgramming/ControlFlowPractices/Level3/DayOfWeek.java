package CoreProgramming.ControlFlowPractices.Level3;

import java.util.Scanner;
// Scanner class is used to take input from the user

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating Scanner object to read user input

        System.out.print("Enter date: ");
        int d = input.nextInt();
        // Reading day of the month

        System.out.print("Enter month: ");
        int m = input.nextInt();
        // Reading month number

        System.out.print("Enter year: ");
        int y = input.nextInt();
        // Reading year

        // Adjusting year based on month (Gregorian calendar formula)
        int y0 = y - (14 - m) / 12;
        // y0 is the adjusted year value

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // x accounts for leap years in Gregorian calendar

        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // m0 is the adjusted month value

        int d0 = (d + x + (31 * m0) / 12) % 7;
        // d0 gives the day of the week (0–6)

        System.out.println("Day of week according to Gregorian calendar: " + d0);
        System.out.println("Month according to Gregorian calendar: " + m0);
        System.out.println("Year according to Gregorian calendar: " + y0);

        // Switch case to print month name based on m0 value
        switch (m0) {
            case 1:
                System.out.println("The Gregorian calender month is: January");
                break;
            case 2:
                System.out.println("The Gregorian calender month is: February");
                break;
            case 3:
                System.out.println("The Gregorian calender month is: March");
                break;
            case 4:
                System.out.println("The Gregorian calender month is: April");
                break;
            case 5:
                System.out.println("The Gregorian calender month is: May");
                break;
            case 6:
                System.out.println("The Gregorian calender month is: June");
                break;
            case 7:
                System.out.println("The Gregorian calender month is: July");
                break;
            case 8:
                System.out.println("The Gregorian calender month is: August");
                break;
            case 9:
                System.out.println("The Gregorian calender month is: September");
                break;
            case 10:
                System.out.println("The Gregorian calender month is: October");
                break;
            case 11:
                System.out.println("The Gregorian calender month is: November");
                break;
            case 12:
                System.out.println("The Gregorian calender month is: December");
                break;
        }

        // Switch case to print day name based on d0 value
        switch (d0) {
            case 0:
                System.out.println("The Gregorian calender date is: Sunday");
                break;
            case 1:
                System.out.println("The Gregorian calender date is: Monday");
                break;
            case 2:
                System.out.println("The Gregorian calender date is: Tuesday");
                break;
            case 3:
                System.out.println("The Gregorian calender date is: Wednesday");
                break;
            case 4:
                System.out.println("The Gregorian calender date is: Thursday");
                break;
            case 5:
                System.out.println("The Gregorian calender date is: Friday");
                break;
            case 6:
                System.out.println("The Gregorian calender date is: Saturday");
                break;
        }
    }
}
