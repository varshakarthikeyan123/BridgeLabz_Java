package CoreProgramming.ExtrasBuiltIn;
public class TimeZone {
    public static String getTime(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    public static void main(String[] args) {
        long currentMillis = System.currentTimeMillis();
        long gmtOffset = 0;
        long istOffset = 5 * 60 * 60 * 1000 + 30 * 60 * 1000;
        long pstOffset = -8 * 60 * 60 * 1000;
        System.out.println("Current time in GMT: " + getTime(currentMillis + gmtOffset));
        System.out.println("Current time in IST: " + getTime(currentMillis + istOffset));
        System.out.println("Current time in PST: " + getTime(currentMillis + pstOffset));
    }
}
