package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(0);
        slowRide.setFuelCapacity(5);
        slowRide.setBasketIncluded(true);
        slowRide.setHelmetColor("Black");
        slowRide.setKickstandIncluded(true);

        Car car = new Car();
        car.setColor("Blue");
        car.setNumberOfPassengers(5);
        car.setCargoCapacity(400);
        car.setFuelCapacity(14);
        car.setNumberOfDoors(4);
        car.setSunroofIncluded(true);
        car.setTrunkSizeCubicFeet(16);
    }
}
