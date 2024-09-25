// This class represents an individual parking slot within a parking floor.
public class ParkingSlot {
    private String slotId;  // Unique identifier for the parking slot
    private boolean isOccupied;  // Status of the slot: true if occupied, false if available
    private VehicleType vehicleType;  // Type of vehicle the slot is designated for

    // Constructor to initialize the ParkingSlot with its ID and vehicle type
    public ParkingSlot(String slotId, VehicleType vehicleType) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isOccupied = false;  // All slots start as unoccupied
    }

    // Method to check if the slot is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Method to occupy the slot when a vehicle is parked
    public void parkVehicle() {
        this.isOccupied = true;
    }

    // Method to vacate the slot when a vehicle leaves
    public void vacateSlot() {
        this.isOccupied = false;
    }

    // Method to get the slot ID
    public String getSlotId() {
        return slotId;
    }

    // Method to get the vehicle type the slot supports
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
