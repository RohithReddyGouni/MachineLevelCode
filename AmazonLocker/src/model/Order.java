// Model class representing a customer order
public class Order {
    private String orderId;   // Unique ID for the order
    private List<Item> items; // List of items in the order

    // Constructor to initialize Order
    public Order(String orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
    }

    // Getters for order attributes
    public String getOrderId() {
        return orderId;
    }

    public List<Item> getItems() {
        return items;
    }
}
