package CoreProgramming.ExtrasBuiltIn;
public class DateFormatting {

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();

        long totalSeconds = currentMillis / 1000;
        long totalDays = totalSeconds / (24 * 60 * 60);

        int year = 1970;
        int month = 1;
        int day = 1;

        long daysLeft = totalDays;

        while (daysLeft >= (isLeapYear(year) ? 366 : 365)) {
            daysLeft -= (isLeapYear(year) ? 366 : 365);
            year++;
        }

        int[] daysInMonth = getDaysInMonth(year);

        for (int i = 0; i < 12; i++) {
            if (daysLeft < daysInMonth[i]) {
                month = i + 1;
                day = (int) daysLeft + 1;
                break;
            } else {
                daysLeft -= daysInMonth[i];
            }
        }

        String format1 = String.format("%02d/%02d/%04d", day, month, year);

        String format2 = String.format("%04d-%02d-%02d", year, month, day);

        String[] weekdays = {"Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed"}; // 1 Jan 1970 was Thursday
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int weekdayIndex = (int)((totalDays + 4) % 7); // 1 Jan 1970 was Thursday (+4)
        String format3 = weekdays[weekdayIndex] + ", " + months[month - 1] + " " + day + ", " + year;

        System.out.println("dd/MM/yyyy : " + format1);
        System.out.println("yyyy-MM-dd : " + format2);
        System.out.println("EEE, MMM dd, yyyy : " + format3);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        return daysInMonth;
    }
}
