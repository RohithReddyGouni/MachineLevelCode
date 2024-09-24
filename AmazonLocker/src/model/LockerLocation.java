// Model class representing a LockerLocation with geo-location and timing details
public class LockerLocation {
    private String locationId;      // Unique ID for the locker location
    private GeoLocation geoLocation; // GeoLocation object representing coordinates
    private List<LocationTiming> timings; // List of timings for the location

    // Constructor to initialize a LockerLocation
    public LockerLocation(String locationId, GeoLocation geoLocation, List<LocationTiming> timings) {
        this.locationId = locationId;
        this.geoLocation = geoLocation;
        this.timings = timings;
    }

    // Getters for location attributes
    public String getLocationId() {
        return locationId;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public List<LocationTiming> getTimings() {
        return timings;
    }
}
