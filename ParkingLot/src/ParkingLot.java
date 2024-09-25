import java.util.HashMap;
import java.util.Map;

// This class represents the entire parking lot with multiple floors.
public class ParkingLot {
    private String lotId;  // Unique identifier for the parking lot
    private Map<String, ParkingFloor> parkingFloors;  // Map of floorId to ParkingFloor objects

    // Constructor to initialize the ParkingLot with an ID and empty floors
    public ParkingLot(String lotId) {
        this.lotId = lotId;
        this.parkingFloors = new HashMap<>();  // Initialize the map of parking floors
    }

    // Method to add a floor to the parking lot
    public void addParkingFloor(ParkingFloor floor) {
        parkingFloors.put(floor.getFloorId(), floor);  // Add the floor using its ID
    }

    // Method to find an available parking slot for a specific vehicle type
    public ParkingSlot findAvailableSlot(VehicleType vehicleType) {
        for (ParkingFloor floor : parkingFloors.values()) {
            // Check each floor for an available slot
            ParkingSlot slot = floor.findAvailableSlot(vehicleType);
            if (slot != null) {
                return slot;  // Return the first available slot found
            }
        }
        return null;  // No available slot found
    }

    // Method to display the status of the entire parking lot
    public void displayParkingLotStatus() {
        for (ParkingFloor floor : parkingFloors.values()) {
            System.out.println("Floor ID: " + floor.getFloorId());
            floor.displayFloorStatus();  // Display the status of each floor
        }
    }

    // Get the parking lot ID
    public String getLotId() {
        return lotId;
    }
}
