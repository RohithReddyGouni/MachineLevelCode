import java.util.Queue;
import java.util.LinkedList;

// This class manages the game flow
public class PlaySnakeAndLadder {
    private GameBoard gameBoard;  // The game board object containing snakes, ladders, and positions
    private Queue<Player> players;  // Queue of players in the game
    private Dice dice;  // Dice object to simulate dice rolls
    private int winningPosition;  // The position a player must reach to win

    // Constructor to initialize the game with board, players, and dice
    public PlaySnakeAndLadder(GameBoard gameBoard, List<Player> playerList, Dice dice) {
        this.gameBoard = gameBoard;
        this.players = new LinkedList<>(playerList);  // Add players to the queue in a round-robin format
        this.dice = dice;
        this.winningPosition = gameBoard.getSize();  // Winning position is the last cell on the board
    }

    // Method to start and manage the game loop
    public void startGame() {
        while (true) {
            Player currentPlayer = players.poll();  // Get the next player in line
            int diceValue = dice.roll();  // Roll the dice to get the move value
            int newPosition = currentPlayer.getPosition() + diceValue;  // Calculate the new position

            // If the new position exceeds the board size, player stays in the same position
            if (newPosition > winningPosition) {
                newPosition = currentPlayer.getPosition();
            } else {
                // Check if the player encounters a snake or ladder
                newPosition = gameBoard.checkForJumper(newPosition);
            }

            // Update the player's position
            currentPlayer.setPosition(newPosition);

            // Check if the player has won the game
            if (newPosition == winningPosition) {
                System.out.println(currentPlayer.getName() + " wins the game!");
                break;  // Exit the game loop when a player wins
            }

            // Add the player back to the queue for the next round
            players.offer(currentPlayer);

            // Print the player's current position after each move
            System.out.println(currentPlayer.getName() + " is now at position " + newPosition);
        }
    }
}
