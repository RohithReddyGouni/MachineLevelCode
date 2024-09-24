// Model class for representing opening and closing time for locker locations
public class Timing {
    private String dayOfWeek;  // Day of the week
    private String openTime;   // Opening time
    private String closeTime;  // Closing time

    // Constructor to initialize Timing
    public Timing(String dayOfWeek, String openTime, String closeTime) {
        this.dayOfWeek = dayOfWeek;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    // Getters for timing attributes
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getOpenTime() {
        return openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }
}
