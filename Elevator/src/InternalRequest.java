// Represents an internal request, where a passenger selects a destination floor.
public class InternalRequest {
    private int destinationFloor;

    // Constructor to initialize the destination floor
    public InternalRequest(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    @Override
    public String toString() {
        return "The destination floor is - " + destinationFloor;
    }
}
