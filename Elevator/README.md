Explanation of Classes:

Elevator.java: This class controls the elevator operations. It handles the requests, manages the queue, processes up and down movements, and tracks the current floor and direction.

Direction.java: An enum representing the direction in which the elevator is moving (UP or DOWN).

State.java: An enum representing the state of the elevator (MOVING, STOPPED, IDLE).

Request.java: Represents a combination of an internal and external request for the elevator (i.e., a passenger's request from inside the elevator and the floor request from outside).

InternalRequest.java: Represents the internal request when a passenger chooses a destination floor.

ExternalRequest.java: Represents the external request when a passenger presses the elevator button to go up or down from a floor.

ProcessJobWorker.java: Starts the elevator processing jobs in a separate thread.

AddJobWorker.java: Adds jobs to the elevator in a separate thread.

TestElevator.java: Main class to simulate the elevator system by creating an elevator, starting it, and adding requests.

