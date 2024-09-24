// Model class representing the opening and closing time of a LockerLocation
public class LocationTiming {
    private String dayOfWeek;  // Day of the week
    private String openTime;   // Opening time in HH:mm format
    private String closeTime;  // Closing time in HH:mm format

    // Constructor to initialize location timing
    public LocationTiming(String dayOfWeek, String openTime, String closeTime) {
        this.dayOfWeek = dayOfWeek;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    // Getters for LocationTiming attributes
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
