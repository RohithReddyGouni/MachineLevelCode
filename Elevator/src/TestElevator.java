// Main class to test the elevator system.
public class TestElevator {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        // Start the elevator in a separate thread
        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator);
        Thread t2 = new Thread(processJobWorker);
        t2.start();

        // Simulate a delay before adding jobs
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create a new internal and external request
        InternalRequest ir = new InternalRequest(5);
        ExternalRequest er = new ExternalRequest(Direction.UP, 0);
        Request request1 = new Request(ir, er);

        // Add the request to the elevator
        new Thread(new AddJobWorker(elevator, request1)).start();

        // Simulate another delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
