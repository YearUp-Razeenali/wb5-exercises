package com.pluralsight;

public class SemiTruck extends Vehicle{

    public SemiTruck(){
        super.setType("SemiTruck");
    }


    public double getWeightOfCargo() {
        return weightOfCargo;
    }

    public void setWeightOfCargo(double weightOfCargo) {
        this.weightOfCargo = weightOfCargo;
    }

    private double weightOfCargo;

}
