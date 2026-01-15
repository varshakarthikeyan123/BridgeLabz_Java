package CoreProgramming.ExtrasBuiltIn;
import java.util.Scanner;
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        day += 7;
        int[] daysInMonth = getDaysInMonth(year);
        if (day > daysInMonth[month - 1]) {
            day -= daysInMonth[month - 1];
            month++;
        }

        month++;
        if (month > 12) {
            month = 1;
            year++;
        }

        year += 2;

        day -= 21;
        while (day <= 0) {
            month--;
            if (month <= 0) {
                month = 12;
                year--;
            }
            daysInMonth = getDaysInMonth(year);
            day += daysInMonth[month - 1];
        }

        System.out.println("Final date: " + day + "/" + month + "/" + year);

        scanner.close();
    }

    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        return daysInMonth;
    }
}

