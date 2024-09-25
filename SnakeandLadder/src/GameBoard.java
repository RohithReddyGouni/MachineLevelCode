import java.util.HashMap;
import java.util.Map;
import java.util.List;

// This class represents the game board where players move
public class GameBoard {
    private int size;  // Size of the game board, typically 100 cells
    private Map<Integer, Jumper> jumpers;  // Mapping for ladders and snakes (jumper positions)

    // Constructor to initialize the game board with size and jumpers (ladders/snakes)
    public GameBoard(int size, List<Jumper> jumpersList) {
        this.size = size;
        this.jumpers = new HashMap<>();  // Initialize the map for jumpers

        // Place each jumper (ladder or snake) on the board
        for (Jumper jumper : jumpersList) {
            jumpers.put(jumper.getStart(), jumper);  // Map start position to the jumper object
        }
    }

    // Method to check if a player encounters a jumper (ladder or snake)
    public int checkForJumper(int position) {
        if (jumpers.containsKey(position)) {  // Check if the current position has a jumper
            Jumper jumper = jumpers.get(position);  // Get the jumper at this position
            return jumper.getEnd();  // Return the destination of the jumper
        }
        return position;  // No jumper, stay at the same position
    }

    // Get the size of the board
    public int getSize() {
        return size;
    }
}
