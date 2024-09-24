// Model class representing an item in an order
public class Item {
    private String itemId;    // Unique identifier for the item
    private String name;      // Name of the item
    private double weight;    // Weight of the item

    // Constructor to initialize Item with itemId, name, and weight
    public Item(String itemId, String name, double weight) {
        this.itemId = itemId;
        this.name = name;
        this.weight = weight;
    }

    // Getters for item attributes
    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
