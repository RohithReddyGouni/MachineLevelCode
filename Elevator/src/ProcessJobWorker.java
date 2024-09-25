// Runnable class to start the elevator processing jobs in a separate thread.
public class ProcessJobWorker implements Runnable {
    private Elevator elevator;

    public ProcessJobWorker(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void run() {
        elevator.startElevator(); // Start the elevator
    }
}
