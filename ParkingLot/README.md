Requirements

> Multilevel Parking lot

> Multiple category of parking space

> Multiple entry and exit (adds an interesting case of concurrency)

> Should not allow more vehicles than allocated space for each category

> Charge should be hourly basis

> Display available number of parking for each category at entry itself.


Summary:

ParkingSlot.java: Represents an individual parking slot, tracking its availability and the type of vehicle it can hold.

ParkingFloor.java: Manages a collection of parking slots, allowing you to add slots and find available ones for specific vehicle types.

ParkingLot.java: Represents the parking lot, which contains multiple floors and helps in finding parking slots across floors.

ParkingMain.java: The main class that simulates the parking system, managing floors, parking slots, and vehicle parking.
