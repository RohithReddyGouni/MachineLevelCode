package com.javastructures;

import java.util.TreeSet;

// Elevator class handles the core elevator operations: processing requests, moving between floors, and managing job queues.
public class Elevator {
    private Direction currentDirection = Direction.UP; // Current direction of the elevator
    private State currentState = State.IDLE; // Current state of the elevator (MOVING, IDLE, STOPPED)
    private int currentFloor = 0; // Current floor the elevator is on

    // Jobs currently being processed
    private TreeSet<Request> currentJobs = new TreeSet<>();

    // Pending up jobs, if they cannot be processed immediately
    private TreeSet<Request> upPendingJobs = new TreeSet<>();

    // Pending down jobs, if they cannot be processed immediately
    private TreeSet<Request> downPendingJobs = new TreeSet<>();

    // Method to start elevator functionality
    public void startElevator() {
        System.out.println("The Elevator has started functioning");
        while (true) { // Infinite loop to simulate continuous operation of the elevator
            if (checkIfJob()) { // Check if there are any jobs to process
                if (currentDirection == Direction.UP) { // Process UP direction requests
                    Request request = currentJobs.pollFirst(); // Fetch the next job
                    processUpRequest(request); // Process the request
                    if (currentJobs.isEmpty()) {
                        addPendingDownJobsToCurrentJobs(); // Handle any pending down jobs
                    }
                }
                if (currentDirection == Direction.DOWN) { // Process DOWN direction requests
                    Request request = currentJobs.pollLast(); // Fetch the next job
                    processDownRequest(request); // Process the request
                    if (currentJobs.isEmpty()) {
                        addPendingUpJobsToCurrentJobs(); // Handle any pending up jobs
                    }
                }
            }
        }
    }

    // Check if there are jobs to process
    public boolean checkIfJob() {
        return !currentJobs.isEmpty();
    }

    // Process an UP direction request
    private void processUpRequest(Request request) {
        int startFloor = currentFloor;

        // Move to the source floor if the elevator is below the requested source floor
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                simulateFloorMovement(i); // Simulate the movement between floors
            }
        }
        System.out.println("Reached Source Floor--opening door");

        // Move to the destination floor
        startFloor = currentFloor;
        for (int i = startFloor + 1; i <= request.getInternalRequest().getDestinationFloor(); i++) {
            simulateFloorMovement(i);
            if (checkIfNewJobCanBeProcessed(request)) {
                break; // If a new job with higher priority can be processed, stop processing the current one
            }
        }
    }

    // Process a DOWN direction request
    private void processDownRequest(Request request) {
        int startFloor = currentFloor;

        // Move to the source floor if the elevator is below the requested source floor
        if (startFloor < request.getExternalRequest().getSourceFloor()) {
            for (int i = startFloor; i <= request.getExternalRequest().getSourceFloor(); i++) {
                simulateFloorMovement(i); // Simulate the movement between floors
            }
        }
        System.out.println("Reached Source Floor--opening door");

        // Move to the destination floor
        startFloor = currentFloor;
        for (int i = startFloor - 1; i >= request.getInternalRequest().getDestinationFloor(); i--) {
            simulateFloorMovement(i);
            if (checkIfNewJobCanBeProcessed(request)) {
                break; // If a new job with higher priority can be processed, stop processing the current one
            }
        }
    }

    // Helper method to simulate moving between floors
    private void simulateFloorMovement(int floor) {
        try {
            Thread.sleep(1000); // Simulate time to move between floors
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("We have reached floor -- " + floor);
        currentFloor = floor; // Update the current floor of the elevator
    }

    // Check if a new job can be processed with higher priority than the current request
    private boolean checkIfNewJobCanBeProcessed(Request currentRequest) {
        if (checkIfJob()) {
            if (currentDirection == Direction.UP) {
                Request request = currentJobs.pollLast(); // Check the last job in the queue
                if (request.getInternalRequest().getDestinationFloor() < currentRequest.getInternalRequest().getDestinationFloor()) {
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }
                currentJobs.add(request);
            }

            if (currentDirection == Direction.DOWN) {
                Request request = currentJobs.pollFirst(); // Check the first job in the queue
                if (request.getInternalRequest().getDestinationFloor() > currentRequest.getInternalRequest().getDestinationFloor()) {
                    currentJobs.add(request);
                    currentJobs.add(currentRequest);
                    return true;
                }
                currentJobs.add(request);
            }
        }
        return false;
    }

    // Add pending down jobs to current job queue
    private void addPendingDownJobsToCurrentJobs() {
        if (!downPendingJobs.isEmpty()) {
            System.out.println("Processing pending down jobs.");
            currentJobs = downPendingJobs;
            currentDirection = Direction.DOWN;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is idle.");
        }
    }

    // Add pending up jobs to current job queue
    private void addPendingUpJobsToCurrentJobs() {
        if (!upPendingJobs.isEmpty()) {
            System.out.println("Processing pending up jobs.");
            currentJobs = upPendingJobs;
            currentDirection = Direction.UP;
        } else {
            currentState = State.IDLE;
            System.out.println("The elevator is idle.");
        }
    }

    // Add a job to the elevator's queue
    public void addJob(Request request) {
        if (currentState == State.IDLE) {
            handleIdleStateJob(request);
        } else if (currentState == State.MOVING) {
            handleMovingStateJob(request);
        }
    }

    // Handle adding a job when the elevator is idle
    private void handleIdleStateJob(Request request) {
        System.out.println("Added job to current queue -- lift is idle.");
        currentState = State.MOVING;
        currentDirection = request.getExternalRequest().getDirectionToGo();
        currentJobs.add(request);
    }

    // Handle adding a job when the elevator is already moving
    private void handleMovingStateJob(Request request) {
        if (request.getExternalRequest().getDirectionToGo() != currentDirection) {
            addtoPendingJobs(request); // Add the job to pending queue
        } else {
            currentJobs.add(request); // Add the job to current queue
        }
    }

    // Add a job to pending jobs (either up or down pending jobs)
    public void addtoPendingJobs(Request request) {
        if (request.getExternalRequest().getDirectionToGo() == Direction.UP) {
            System.out.println("Adding to pending up jobs");
            upPendingJobs.add(request);
        } else {
            System.out.println("Adding to pending down jobs");
            downPendingJobs.add(request);
        }
    }
}
