/*
 This program demonstrates Time Zone conversion.
 It converts the current system time (in milliseconds)
 into readable HH:MM:SS format for different time zones
 like GMT, IST, and PST using time offsets.
*/
package CoreProgramming.ExtrasBuiltIn;

/*
 The TimeZone class contains methods to convert milliseconds
 into human-readable time and display time for different zones.
*/
public class TimeZone {

    // Method to convert milliseconds into HH:MM:SS format
    public static String getTime(long millis) {

        long totalSeconds = millis / 1000;
        // Converting milliseconds into total seconds

        long seconds = totalSeconds % 60;
        // Extracting remaining seconds after minutes calculation

        long totalMinutes = totalSeconds / 60;
        // Converting total seconds into total minutes

        long minutes = totalMinutes % 60;
        // Extracting remaining minutes after hours calculation

        long totalHours = totalMinutes / 60;
        // Converting total minutes into total hours

        long hours = totalHours % 24;
        // Extracting hours in 24-hour format

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        // Formatting and returning time in HH:MM:SS format
    }

    public static void main(String[] args) {

        long currentMillis = System.currentTimeMillis();
        // Getting the current system time in milliseconds since Unix epoch

        long gmtOffset = 0;
        // GMT has zero offset from UTC

        long istOffset = 5 * 60 * 60 * 1000 + 30 * 60 * 1000;
        // IST offset calculated as +5 hours 30 minutes in milliseconds

        long pstOffset = -8 * 60 * 60 * 1000;
        // PST offset calculated as -8 hours in milliseconds

        System.out.println("Current time in GMT: " + getTime(currentMillis + gmtOffset));
        // Displaying current time in GMT

        System.out.println("Current time in IST: " + getTime(currentMillis + istOffset));
        // Displaying current time in IST

        System.out.println("Current time in PST: " + getTime(currentMillis + pstOffset));
        // Displaying current time in PST
    }
}
