// This is the main class to simulate the parking lot system.
public class ParkingMain {
    public static void main(String[] args) {
        // Create a new ParkingLot
        ParkingLot parkingLot = new ParkingLot("PLOT_01");

        // Create two floors
        ParkingFloor floor1 = new ParkingFloor("FLOOR_1");
        ParkingFloor floor2 = new ParkingFloor("FLOOR_2");

        // Add parking slots to floor 1
        floor1.addParkingSlot(new ParkingSlot("SLOT_1", VehicleType.CAR));
        floor1.addParkingSlot(new ParkingSlot("SLOT_2", VehicleType.BIKE));

        // Add parking slots to floor 2
        floor2.addParkingSlot(new ParkingSlot("SLOT_3", VehicleType.CAR));
        floor2.addParkingSlot(new ParkingSlot("SLOT_4", VehicleType.TRUCK));

        // Add floors to the parking lot
        parkingLot.addParkingFloor(floor1);
        parkingLot.addParkingFloor(floor2);

        // Display the initial status of the parking lot
        System.out.println("Initial Parking Lot Status:");
        parkingLot.displayParkingLotStatus();

        // Find and park a vehicle in a slot
        ParkingSlot availableSlot = parkingLot.findAvailableSlot(VehicleType.CAR);
        if (availableSlot != null) {
            System.out.println("Parking in Slot: " + availableSlot.getSlotId());
            availableSlot.parkVehicle();  // Park the vehicle in the available slot
        } else {
            System.out.println("No available slot for CAR.");
        }

        // Display the status of the parking lot after parking a car
        System.out.println("Parking Lot Status After Parking:");
        parkingLot.displayParkingLotStatus();
    }
}
