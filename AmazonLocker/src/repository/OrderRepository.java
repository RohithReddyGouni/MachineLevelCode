// Interface for managing order records
public interface OrderRepository {
    Order findOrderById(String orderId);  // Find order by ID
    List<Order> findAllOrders();          // Find all orders
}
