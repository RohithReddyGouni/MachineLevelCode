// Service to manage delivery operations
public class DeliveryService {

    private LockerRepository lockerRepository; // Dependency for locker access
    private LockerPackageRepository lockerPackageRepository; // To store package info

    // Constructor to initialize DeliveryService with repositories
    public DeliveryService(LockerRepository lockerRepository, LockerPackageRepository lockerPackageRepository) {
        this.lockerRepository = lockerRepository;
        this.lockerPackageRepository = lockerPackageRepository;
    }

    // Method to assign a package to a locker
    public void assignPackageToLocker(LockerPackage lockerPackage) {
        // Get all available lockers
        List<Locker> availableLockers = lockerRepository.findAllAvailableLockers();

        // Find the first available locker
        for (Locker locker : availableLockers) {
            if (locker.getSize() == SizeUtil.calculateLockerSize(lockerPackage.getItem())) {
                // Assign the locker ID to the package
                lockerPackage.setLockerId(locker.getLockerId());
                locker.setStatus(LockerStatus.IN_USE);
                lockerRepository.save(locker); // Save updated locker status
                lockerPackageRepository.save(lockerPackage); // Save package details
                return; // Stop after assigning
            }
        }

        // If no locker found, throw an exception (or handle appropriately)
        throw new RuntimeException("No available locker for the package size.");
    }

    // Method to deliver the package to a customer's locker
    public void deliverPackageToLocker(String lockerId, LockerPackage lockerPackage) {
        // Find the locker by ID
        Locker locker = lockerRepository.findLockerById(lockerId);

        // Check if locker is available
        if (locker != null && locker.getStatus() == LockerStatus.AVAILABLE) {
            // Assign the package to the locker and update status
            locker.setStatus(LockerStatus.IN_USE);
            lockerPackage.setLockerId(lockerId);
            lockerPackageRepository.save(lockerPackage); // Save package details
            lockerRepository.save(locker); // Update locker status
        } else {
            throw new RuntimeException("Locker is unavailable.");
        }
    }
}
