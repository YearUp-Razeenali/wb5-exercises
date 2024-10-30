package com.pluralsight;

public class Car extends Vehicle{

    private String truckContents;
    private String airFreshenerType;


    public Car(String type, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String truckContents, String airFreshenerType) {
        super(type, color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.truckContents = truckContents;
        this.airFreshenerType = airFreshenerType;
    }

    public Car(String truckContents, String airFreshenerType) {
        this.truckContents = truckContents;
        this.airFreshenerType = airFreshenerType;
    }

    public Car(){
        super.setType("Car");
    }


    public String getTruckContents() {
        return truckContents;
    }

    public void setTruckContents(String truckContents) {
        this.truckContents = truckContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }

}
