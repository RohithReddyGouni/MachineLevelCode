// Model class representing packaging information
public class Pack {
    private String packId;   // Unique ID for the package
    private Item item;       // Item in the package
    private String lockerId; // ID of the locker where package is stored

    // Constructor to initialize Pack
    public Pack(String packId, Item item, String lockerId) {
        this.packId = packId;
        this.item = item;
        this.lockerId = lockerId;
    }

    // Getters for pack attributes
    public String getPackId() {
        return packId;
    }

    public Item getItem() {
        return item;
    }

    public String getLockerId() {
        return lockerId;
    }
}
