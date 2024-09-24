// Service to handle sending notifications
public class NotificationService {

    private NotificationRepository notificationRepository; // Dependency for accessing notifications

    // Constructor to initialize NotificationService with NotificationRepository
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    // Method to send notification to the customer
    public void sendNotification(String customerId, String message) {
        // Generate a new notification ID
        String notificationId = IdGenerator.generateId("NOTIF");

        // Create a new Notification object
        Notification notification = new Notification(notificationId, message, customerId);

        // Save the notification in the repository
        notificationRepository.save(notification);

        // Simulate sending a notification (e.g., email or SMS)
        System.out.println("Notification sent to Customer ID: " + customerId);
    }
}
