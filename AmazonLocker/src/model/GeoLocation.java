package model;

// Model class representing a geographical location with latitude and longitude
public class GeoLocation {
    private double latitude;  // Latitude of the location
    private double longitude; // Longitude of the location

    // Constructor to initialize GeoLocation with latitude and longitude
    public GeoLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters for latitude and longitude
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}


