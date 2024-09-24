// Service to handle customer-related operations
public class CustomerService {

    private OrderRepository orderRepository; // Dependency to access orders

    // Constructor to initialize CustomerService with OrderRepository
    public CustomerService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Method to track the order status for a customer
    public String trackOrder(String customerId, String orderId) {
        // Retrieve the order by its ID
        Order order = orderRepository.findOrderById(orderId);

        // Check if the order belongs to the customer
        if (order != null) {
            // Assuming we have order status logic, for now return a placeholder status
            return "Order ID: " + orderId + " is in transit";
        } else {
            return "Order not found";
        }
    }
}
