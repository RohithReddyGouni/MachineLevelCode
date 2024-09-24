// Service to handle return operations
public class ReturnService {

    private LockerPackageRepository lockerPackageRepository; // Dependency for accessing locker packages

    // Constructor to initialize ReturnService with LockerPackageRepository
    public ReturnService(LockerPackageRepository lockerPackageRepository) {
        this.lockerPackageRepository = lockerPackageRepository;
    }

    // Method to process the return of a package
    public void processReturn(String packageId, String customerId) {
        // Find the package by ID
        LockerPackage lockerPackage = lockerPackageRepository.findPackageById(packageId);

        // Validate if the package exists and belongs to the customer
        if (lockerPackage != null) {
            // Logic to handle return, e.g., update package status, notify customer
            System.out.println("Return processed for Package ID: " + packageId);
            // Logic to open locker and allow customer to drop off the return item
        } else {
            throw new RuntimeException("Package not found or does not belong to customer.");
        }
    }
}
