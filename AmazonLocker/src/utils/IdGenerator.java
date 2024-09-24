// Utility class to generate unique IDs for entities
public class IdGenerator {

    // Method to generate a unique ID for an entity
    public static String generateId(String entityType) {
        // Logic to generate and return a unique ID (e.g., based on timestamp or UUID)
        return entityType + "_" + UUID.randomUUID().toString();
    }
}
