// Model class representing a package to be stored in the locker
public class LockerPackage {
    private String packageId;   // Unique ID for the package
    private Item item;          // Item in the package
    private String lockerId;    // ID of the locker where package is stored

    // Constructor to initialize LockerPackage
    public LockerPackage(String packageId, Item item, String lockerId) {
        this.packageId = packageId;
        this.item = item;
        this.lockerId = lockerId;
    }

    // Getters for package attributes
    public String getPackageId() {
        return packageId;
    }

    public Item getItem() {
        return item;
    }

    public String getLockerId() {
        return lockerId;
    }
}
