// This class represents a dice used in the game
public class Dice {
    private int numberOfFaces;  // Number of faces on the dice, typically 6

    // Constructor to initialize the dice with the number of faces
    public Dice(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    // Method to roll the dice and return a number between 1 and the number of faces
    public int roll() {
        return (int)(Math.random() * numberOfFaces) + 1;  // Random number between 1 and numberOfFaces
    }
}
