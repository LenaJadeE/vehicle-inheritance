package com.pluralsight;

public class SemiTruck extends Vehicle {

    private int trailerLengthFeet;
    private boolean sleeperCabIncluded;
    private int numberOfAxles;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public int getTrailerLengthFeet() {
        return trailerLengthFeet;
    }

    public void setTrailerLengthFeet(int trailerLengthFeet) {
        this.trailerLengthFeet = trailerLengthFeet;
    }

    public boolean isSleeperCabIncluded() {
        return sleeperCabIncluded;
    }

    public void setSleeperCabIncluded(boolean sleeperCabIncluded) {
        this.sleeperCabIncluded = sleeperCabIncluded;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
