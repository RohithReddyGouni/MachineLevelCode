// Interface for managing notification records
public interface NotificationRepository {
    Notification findNotificationById(String notificationId);  // Find notification by ID
    List<Notification> findAllByCustomer(String customerId);   // Find notifications by customer ID
}
