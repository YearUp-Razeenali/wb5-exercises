package com.pluralsight;

public class SemiTruck extends Vehicle{

    private String cargo;
    private boolean hasTrailer;
    private double weightOfCargo;

    public SemiTruck(String type, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String cargo, boolean hasTrailer, double weightOfCargo) {
        super(type, color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.cargo = cargo;
        this.hasTrailer = hasTrailer;
        this.weightOfCargo = weightOfCargo;
    }

    public SemiTruck(){
        super.setType("SemiTruck");
    }

    public double getWeightOfCargo() {
        return weightOfCargo;
    }

    public void setWeightOfCargo(double weightOfCargo) {
        this.weightOfCargo = weightOfCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

}
