// Interface for accessing and managing LockerLocation data
public interface LockerLocationRepository {
    LockerLocation findLockerLocationById(String locationId);  // Find locker location by ID
    List<LockerLocation> findAllLocations();                  // Find all locker locations
}
