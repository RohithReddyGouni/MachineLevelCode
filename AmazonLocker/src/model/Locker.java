// Model class representing a Locker
public class Locker {
    private String lockerId;   // Unique identifier for the locker
    private LockerSize size;   // Size of the locker
    private LockerStatus status; // Current status of the locker (available, in-use)

    // Constructor to initialize a Locker
    public Locker(String lockerId, LockerSize size, LockerStatus status) {
        this.lockerId = lockerId;
        this.size = size;
        this.status = status;
    }

    // Getters and setters for locker attributes
    public String getLockerId() {
        return lockerId;
    }

    public LockerSize getSize() {
        return size;
    }

    public LockerStatus getStatus() {
        return status;
    }

    public void setStatus(LockerStatus status) {
        this.status = status;
    }
}
