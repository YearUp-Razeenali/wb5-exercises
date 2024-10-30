package com.pluralsight;

public class Moped extends Vehicle{

    public Moped(String type, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(type, color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped(){
        super.setType("Moped");
    }

}
