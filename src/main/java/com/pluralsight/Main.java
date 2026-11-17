package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5);
        slowRide.setBasketIncluded(true);
        slowRide.setHelmetColor("Black");
        slowRide.setKickstandIncluded(true);

        Car car = new Car("Blue", 5, 400, 14);
        car.setNumberOfDoors(4);
        car.setSunroofIncluded(true);
        car.setTrunkSizeCubicFeet(16);

        SemiTruck semiTruck = new SemiTruck("White", 2, 45000, 150);
        semiTruck.setTrailerLengthFeet(53);
        semiTruck.setSleeperCabIncluded(true);
        semiTruck.setNumberOfAxles(5);

        Hovercraft hovercraft = new Hovercraft("Gray", 6, 1500, 75);
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

        slowRide.setColor("Green");
        car.setNumberOfPassengers(4);
        semiTruck.setCargoCapacity(48000);
        hovercraft.setFuelCapacity(80);

        System.out.println();
        System.out.println("After the setters:");
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Car passengers: " + car.getNumberOfPassengers());
        System.out.println("Semi truck cargo: " + semiTruck.getCargoCapacity());
        System.out.println("Hovercraft fuel: " + hovercraft.getFuelCapacity());
    }
}
