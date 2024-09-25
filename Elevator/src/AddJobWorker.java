// Runnable class to add jobs to the elevator's queue in a separate thread.
public class AddJobWorker implements Runnable {
    private Elevator elevator;
    private Request request;

    public AddJobWorker(Elevator elevator, Request request) {
        this.elevator = elevator;
        this.request = request;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200); // Simulate a short delay before adding the job
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elevator.addJob(request); // Add the job to the elevator
    }
}
