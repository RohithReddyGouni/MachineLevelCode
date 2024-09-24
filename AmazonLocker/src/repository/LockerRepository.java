// Interface for accessing and managing Locker data
public interface LockerRepository {
    Locker findLockerById(String lockerId);           // Find a locker by ID
    List<Locker> findAllAvailableLockers();           // Find all available lockers
}
