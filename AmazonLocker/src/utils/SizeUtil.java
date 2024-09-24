// Utility class to handle locker size-related calculations
public class SizeUtil {

    // Method to calculate the required locker size for an item
    public static LockerSize calculateLockerSize(Item item) {
        // Logic to calculate locker size based on the item size or weight
        double weight = item.getWeight();
        if (weight < 1.0) {
            return LockerSize.SMALL;
        } else if (weight < 5.0) {
            return LockerSize.MEDIUM;
        } else {
            return LockerSize.LARGE;
        }
    }
}
