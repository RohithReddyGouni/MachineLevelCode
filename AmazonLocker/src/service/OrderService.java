// Service to handle order operations
public class OrderService {

    private OrderRepository orderRepository; // Dependency for accessing orders
    private LockerService lockerService; // Dependency to access locker service

    // Constructor to initialize OrderService with repositories and services
    public OrderService(OrderRepository orderRepository, LockerService lockerService) {
        this.orderRepository = orderRepository;
        this.lockerService = lockerService;
    }

    // Method to create an order for a customer
    public Order createOrder(String customerId, List<Item> items) {
        // Generate a new order ID
        String orderId = IdGenerator.generateId("ORDER");

        // Create a new Order object
        Order order = new Order(orderId, items);

        // Save the order in the repository
        orderRepository.save(order);

        // Notify customer (in real world, use NotificationService)
        System.out.println("Order created for Customer ID: " + customerId);

        return order; // Return the created order
    }

    // Method to deliver the order to a locker
    public void deliverOrderToLocker(Order order, String lockerId) {
        // Loop through each item in the order
        for (Item item : order.getItems()) {
            // Create a package for the item
            LockerPackage lockerPackage = new LockerPackage(IdGenerator.generateId("PKG"), item, lockerId);

            // Use LockerService to open the locker and place the package inside
            lockerService.openLocker(lockerId);
            System.out.println("Delivered item: " + item.getName() + " to locker " + lockerId);
        }
    }
}
