import java.util.HashMap;
import java.util.Map;

// This class represents a parking floor, containing multiple parking slots.
public class ParkingFloor {
    private String floorId;  // Unique identifier for the floor
    private Map<String, ParkingSlot> parkingSlots;  // Map of slotId to ParkingSlot objects

    // Constructor to initialize the ParkingFloor with an ID and empty parking slots
    public ParkingFloor(String floorId) {
        this.floorId = floorId;
        this.parkingSlots = new HashMap<>();  // Initialize the map of parking slots
    }

    // Method to add a parking slot to the floor
    public void addParkingSlot(ParkingSlot slot) {
        parkingSlots.put(slot.getSlotId(), slot);  // Add the slot to the map using its ID
    }

    // Method to find an available parking slot for a specific vehicle type
    public ParkingSlot findAvailableSlot(VehicleType vehicleType) {
        for (ParkingSlot slot : parkingSlots.values()) {
            // Return the first available slot for the specified vehicle type
            if (!slot.isOccupied() && slot.getVehicleType() == vehicleType) {
                return slot;
            }
        }
        return null;  // No available slot found
    }

    // Method to display the status of all parking slots on the floor
    public void displayFloorStatus() {
        for (ParkingSlot slot : parkingSlots.values()) {
            System.out.println("Slot ID: " + slot.getSlotId() + " | Occupied: " + slot.isOccupied());
        }
    }

    // Get the floor ID
    public String getFloorId() {
        return floorId;
    }
}
