package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;
    private boolean sunroofIncluded;
    private int trunkSizeCubicFeet;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSunroofIncluded() {
        return sunroofIncluded;
    }

    public void setSunroofIncluded(boolean sunroofIncluded) {
        this.sunroofIncluded = sunroofIncluded;
    }

    public int getTrunkSizeCubicFeet() {
        return trunkSizeCubicFeet;
    }

    public void setTrunkSizeCubicFeet(int trunkSizeCubicFeet) {
        this.trunkSizeCubicFeet = trunkSizeCubicFeet;
    }
}
