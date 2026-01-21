/*
 This program calculates the current date using system time (milliseconds since 1 Jan 1970).
 It manually converts milliseconds into days, then computes the current year, month, and day.
 Finally, it formats the date into multiple standard formats without using built-in Date APIs.
*/
package coreprogramming.extrasbuiltIn;
// Defines the package for extra built-in utility programs

public class DateFormatting {
    // Main class for formatting the current date manually

    public static void main(String[] args) {
        // Main method where execution starts

        long currentMillis = System.currentTimeMillis();
        // Getting current time in milliseconds since 1 Jan 1970 (Unix Epoch)

        long totalSeconds = currentMillis / 1000;
        // Converting milliseconds into seconds

        long totalDays = totalSeconds / (24 * 60 * 60);
        // Converting total seconds into total days

        int year = 1970;
        int month = 1;
        int day = 1;
        // Initializing date to the Unix epoch start date (01/01/1970)

        long daysLeft = totalDays;
        // Variable to track remaining days to compute date

        // Loop to calculate current year by subtracting days year by year
        while (daysLeft >= (isLeapYear(year) ? 366 : 365)) {
            daysLeft -= (isLeapYear(year) ? 366 : 365);
            // Subtracting days of the current year
            year++;
            // Moving to the next year
        }

        int[] daysInMonth = getDaysInMonth(year);
        // Getting number of days in each month for the calculated year

        // Loop to calculate the current month and day
        for (int i = 0; i < 12; i++) {

            if (daysLeft < daysInMonth[i]) {
                // Checking if remaining days fit within the current month
                month = i + 1;
                // Assigning month number (1-based)
                day = (int) daysLeft + 1;
                // Assigning day value
                break;
                // Exit loop once month and day are found
            } else {
                daysLeft -= daysInMonth[i];
                // Subtracting days of the current month
            }
        }

        String format1 = String.format("%02d/%02d/%04d", day, month, year);
        // Formatting date as dd/MM/yyyy

        String format2 = String.format("%04d-%02d-%02d", year, month, day);
        // Formatting date as yyyy-MM-dd

        String[] weekdays = {"Thu", "Fri", "Sat", "Sun", "Mon", "Tue", "Wed"};
        // Array storing weekday names (1 Jan 1970 was Thursday)

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        // Array storing short month names

        int weekdayIndex = (int) ((totalDays + 4) % 7);
        // Calculating weekday index (+4 because 1 Jan 1970 was Thursday)

        String format3 = weekdays[weekdayIndex] + ", "
                + months[month - 1] + " " + day + ", " + year;
        // Formatting date as EEE, MMM dd, yyyy

        System.out.println("dd/MM/yyyy : " + format1);
        // Printing first date format

        System.out.println("yyyy-MM-dd : " + format2);
        // Printing second date format

        System.out.println("EEE, MMM dd, yyyy : " + format3);
        // Printing third date format
    }

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition based on Gregorian calendar
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to return number of days in each month for a given year
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
        // Initializing days in each month

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
            // Updating February days for leap year
        }

        return daysInMonth;
        // Returning the updated days-in-month array
    }
}
