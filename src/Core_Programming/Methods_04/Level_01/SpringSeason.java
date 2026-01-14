package Core_Programming.Methods_04.Level_01;

public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4 || month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        System.out.println(isSpring(month, day)
                ? "Its a Spring Season"
                : "Not a Spring Season");
    }
}
