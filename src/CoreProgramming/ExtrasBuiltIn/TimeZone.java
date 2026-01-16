package CoreProgramming.ExtrasBuiltIn;

public class TimeZone {

    // Method to convert milliseconds into HH:MM:SS format
    public static String getTime(long millis) {

        long totalSeconds = millis / 1000;
        // Converting milliseconds to total seconds

        long seconds = totalSeconds % 60;
        // Extracting remaining seconds

        long totalMinutes = totalSeconds / 60;
        // Converting total seconds to total minutes

        long minutes = totalMinutes % 60;
        // Extracting remaining minutes

        long totalHours = totalMinutes / 60;
        // Converting total minutes to total hours

        long hours = totalHours % 24;
        // Extracting hours in 24-hour format

        // Formatting time as HH:MM:SS
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();
        // Getting current time in milliseconds since 1 Jan 1970 (Unix epoch)

        long gmtOffset = 0;
        // GMT has zero offset from UTC

        long istOffset = 5 * 60 * 60 * 1000 + 30 * 60 * 1000;
        // IST is GMT + 5 hours 30 minutes (converted to milliseconds)

        long pstOffset = -8 * 60 * 60 * 1000;
        // PST is GMT - 8 hours (converted to milliseconds)

        // Displaying current time in different time zones
        System.out.println("Current time in GMT: " + getTime(currentMillis + gmtOffset));
        System.out.println("Current time in IST: " + getTime(currentMillis + istOffset));
        System.out.println("Current time in PST: " + getTime(currentMillis + pstOffset));
    }
}
