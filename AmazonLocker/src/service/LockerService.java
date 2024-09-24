// Service to handle locker management
public class LockerService {

    private LockerRepository lockerRepository; // Dependency for locker access

    // Constructor to initialize LockerService with LockerRepository
    public LockerService(LockerRepository lockerRepository) {
        this.lockerRepository = lockerRepository;
    }

    // Method to check locker availability
    public boolean isLockerAvailable(String lockerId) {
        // Retrieve the locker by its ID
        Locker locker = lockerRepository.findLockerById(lockerId);

        // Return true if locker is available, otherwise false
        return locker != null && locker.getStatus() == LockerStatus.AVAILABLE;
    }

    // Method to open the locker
    public void openLocker(String lockerId) {
        // Find the locker by ID
        Locker locker = lockerRepository.findLockerById(lockerId);

        // Check if locker exists and is in-use
        if (locker != null && locker.getStatus() == LockerStatus.IN_USE) {
            // Logic to physically open the locker can be added here
            System.out.println("Locker " + lockerId + " is opened.");
        } else {
            throw new RuntimeException("Locker not found or is not in use.");
        }
    }
}
