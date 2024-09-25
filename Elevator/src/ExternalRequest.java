// Represents an external request, where a passenger presses the up/down button from a floor.
public class ExternalRequest {
    private Direction directionToGo;
    private int sourceFloor;

    // Constructor to initialize the direction and source floor
    public ExternalRequest(Direction directionToGo, int sourceFloor) {
        this.directionToGo = directionToGo;
        this.sourceFloor = sourceFloor;
    }

    public Direction getDirectionToGo() {
        return directionToGo;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    @Override
    public String toString() {
        return "The elevator has been requested on floor " + sourceFloor + " and the person wants to go in the " + directionToGo;
    }
}
