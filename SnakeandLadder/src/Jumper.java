// This class represents either a snake or a ladder (a jumper)
public class Jumper {
    private int start;  // Start position of the jumper (top of the snake or bottom of the ladder)
    private int end;    // End position of the jumper (bottom of the snake or top of the ladder)

    // Constructor to initialize the jumper with start and end positions
    public Jumper(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Get the start position of the jumper
    public int getStart() {
        return start;
    }

    // Get the end position of the jumper
    public int getEnd() {
        return end;
    }
}
