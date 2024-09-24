// Interface for accessing and managing LockerPackage data
public interface LockerPackageRepository {
    LockerPackage findPackageById(String packageId);  // Find a package by ID
    List<LockerPackage> findPackagesByLocker(String lockerId); // Find packages in a locker
}
