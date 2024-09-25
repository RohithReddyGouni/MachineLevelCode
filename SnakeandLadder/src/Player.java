// This class represents a player in the game
public class Player {
    private String name;  // Name of the player
    private int position;  // Current position of the player on the board

    // Constructor to initialize player with name and starting position
    public Player(String name) {
        this.name = name;
        this.position = 0;  // All players start at position 0 (off the board)
    }

    // Get the name of the player
    public String getName() {
        return name;
    }

    // Get the current position of the player
    public int getPosition() {
        return position;
    }

    // Set a new position for the player
    public void setPosition(int position) {
        this.position = position;
    }
}
