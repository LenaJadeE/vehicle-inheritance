package com.pluralsight;

public class Car {

    private int numberOfDoors;
    private boolean sunroofIncluded;
    private int trunkSizeCubicFeet;

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
