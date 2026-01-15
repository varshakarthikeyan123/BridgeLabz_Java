package CoreProgramming.ExtrasBuiltIn;
import java.util.Scanner;
public class DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first date:");
        int day1 = getInput(scanner, "Day: ");
        int month1 = getInput(scanner, "Month: ");
        int year1 = getInput(scanner, "Year: ");

        System.out.println("Enter second date:");
        int day2 = getInput(scanner, "Day: ");
        int month2 = getInput(scanner, "Month: ");
        int year2 = getInput(scanner, "Year: ");

        int result = compareDates(day1, month1, year1, day2, month2, year2);

        if (result < 0) {
            System.out.println("The first date is before the second date.");
        } else if (result > 0) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int compareDates(int day1, int month1, int year1,
                                   int day2, int month2, int year2) {
        if (year1 != year2) {
            return (year1 < year2) ? -1 : 1;
        } else if (month1 != month2) {
            return (month1 < month2) ? -1 : 1;
        } else if (day1 != day2) {
            return (day1 < day2) ? -1 : 1;
        } else {
            return 0;
        }
    }
}
