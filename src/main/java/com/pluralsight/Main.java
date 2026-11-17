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

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("White");
        semiTruck.setNumberOfPassengers(2);
        semiTruck.setCargoCapacity(45000);
        semiTruck.setFuelCapacity(150);
        semiTruck.setTrailerLengthFeet(53);
        semiTruck.setSleeperCabIncluded(true);
        semiTruck.setNumberOfAxles(5);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Gray");
        hovercraft.setNumberOfPassengers(6);
        hovercraft.setCargoCapacity(1500);
        hovercraft.setFuelCapacity(75);
        hovercraft.setNumberOfJets(2);
        hovercraft.setSkirtColor("Silver");
        hovercraft.setWaterCapable(true);

        System.out.println("Moped: " + slowRide.getColor() + ", passengers " + slowRide.getNumberOfPassengers()
                + ", cargo " + slowRide.getCargoCapacity() + ", fuel " + slowRide.getFuelCapacity()
                + ", basketIncluded " + slowRide.isBasketIncluded()
                + ", helmetColor " + slowRide.getHelmetColor()
                + ", kickstandIncluded " + slowRide.isKickstandIncluded());
        System.out.println("Car: " + car.getColor() + ", passengers " + car.getNumberOfPassengers()
                + ", cargo " + car.getCargoCapacity() + ", fuel " + car.getFuelCapacity()
                + ", numberOfDoors " + car.getNumberOfDoors()
                + ", sunroofIncluded " + car.isSunroofIncluded()
                + ", trunkSizeCubicFeet " + car.getTrunkSizeCubicFeet());
        System.out.println("Semi truck: " + semiTruck.getColor() + ", passengers " + semiTruck.getNumberOfPassengers()
                + ", cargo " + semiTruck.getCargoCapacity() + ", fuel " + semiTruck.getFuelCapacity()
                + ", trailerLengthFeet " + semiTruck.getTrailerLengthFeet()
                + ", sleeperCabIncluded " + semiTruck.isSleeperCabIncluded()
                + ", numberOfAxles " + semiTruck.getNumberOfAxles());
        System.out.println("Hovercraft: " + hovercraft.getColor() + ", passengers " + hovercraft.getNumberOfPassengers()
                + ", cargo " + hovercraft.getCargoCapacity() + ", fuel " + hovercraft.getFuelCapacity()
                + ", numberOfJets " + hovercraft.getNumberOfJets()
                + ", skirtColor " + hovercraft.getSkirtColor()
                + ", waterCapable " + hovercraft.isWaterCapable());
    }
}
