package com.pluralsight;

public class Moped extends Vehicle{

    private boolean basketIncluded;
    private String helmetColor;
    private boolean kickstandIncluded;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public boolean isBasketIncluded() {
        return basketIncluded;
    }

    public void setBasketIncluded(boolean basketIncluded) {
        this.basketIncluded = basketIncluded;
    }

    public String getHelmetColor() {
        return helmetColor;
    }

    public void setHelmetColor(String helmetColor) {
        this.helmetColor = helmetColor;
    }

    public boolean isKickstandIncluded() {
        return kickstandIncluded;
    }

    public void setKickstandIncluded(boolean kickstandIncluded) {
        this.kickstandIncluded = kickstandIncluded;
    }
}
