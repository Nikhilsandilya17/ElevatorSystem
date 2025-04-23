package model;

public class Elevator {
    private int destinationFloor;
    private ElevatorDirection elevatorDirection;
    private int currentFloor;
    private boolean isRunning;

    public Elevator(int destinationFloor, ElevatorDirection elevatorDirection, int currentFloor) {
        this.destinationFloor = destinationFloor;
        this.elevatorDirection = elevatorDirection;
        this.currentFloor = currentFloor;
        this.isRunning = false;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public ElevatorDirection getDirection() {
        return elevatorDirection;
    }

    public void setDirection(ElevatorDirection elevatorDirection) {
        this.elevatorDirection = elevatorDirection;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void run() {
        this.isRunning = true;
    }
    public void stop() {
        this.isRunning = false;
    }

}
