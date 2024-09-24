// Model class representing a notification for customers
public class Notification {
    private String notificationId;  // Unique ID for the notification
    private String message;         // Notification message to the customer
    private String customerId;      // ID of the customer receiving the notification

    // Constructor to initialize Notification
    public Notification(String notificationId, String message, String customerId) {
        this.notificationId = notificationId;
        this.message = message;
        this.customerId = customerId;
    }

    // Getters for notification attributes
    public String getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public String getCustomerId() {
        return customerId;
    }
}
