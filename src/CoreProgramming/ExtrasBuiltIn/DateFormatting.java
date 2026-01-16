package CoreProgramming.ExtrasBuiltIn;

public class DateFormatting {

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();
        // Getting current time in milliseconds since 1 Jan 1970 (Epoch time)

        long totalSeconds = currentMillis / 1000;
        // Converting milliseconds to seconds

        long totalDays = totalSeconds / (24 * 60 * 60);
        // Converting seconds to total number of days since 1 Jan 1970

        int year = 1970;
        int month = 1;
        int day = 1;
        // Initializing date to the Unix epoch start date

        long daysLeft = totalDays;
        // Remaining days to calculate year, month, and day

        // Calculating the current year by subtracting days year by year
        while (daysLeft >= (isLeapYear(year) ? 366 : 365)) {
            daysLeft -= (isLeapYear(year) ? 366 : 365);
            year++;
        }

        // Getting number of days in each month for the calculated year
        int[] daysInMonth = getDaysInMonth(year);

        // Calculating the current month and day
        for (int i = 0; i < 12; i++) {
            if (daysLeft < daysInMonth[i]) {
                month = i + 1;
                day = (int) daysLeft + 1;
                break;
            } else {
                daysLeft -= daysInMonth[i];
            }
        }

        // Formatting date as dd/MM/yyyy
        String format1 = String.format("%02d/%02d/%04d", day, month, year);

        // Formatting date as yyyy-MM-dd
        String format2 = String.format("%04d-%02d-%02d", year, month, day);

        // Weekday names (1 Jan 1970 was Thursday)
        String[] weekdays = {"Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed"};

        // Month short names
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Calculating weekday index
        int weekdayIndex = (int) ((totalDays + 4) % 7);
        // +4 because 1 Jan 1970 was Thursday

        // Formatting date as EEE, MMM dd, yyyy
        String format3 = weekdays[weekdayIndex] + ", "
                + months[month - 1] + " " + day + ", " + year;

        // Printing all formatted dates
        System.out.println("dd/MM/yyyy : " + format1);
        System.out.println("yyyy-MM-dd : " + format2);
        System.out.println("EEE, MMM dd, yyyy : " + format3);
    }

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return days in each month for a given year
    public static int[] getDaysInMonth(int year) {
        int[] daysInMonth = {
                31, // January
                28, // February
                31, // March
                30, // April
                31, // May
                30, // June
                31, // July
                31, // August
                30, // September
                31, // October
                30, // November
                31  // December
        };

        // Adjust February for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return daysInMonth;
    }
}
