package com.pluralsight;

public class Hovercraft extends Vehicle{

    boolean onWater;
    private float hoverHeight;

    public Hovercraft(String type, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean onWater, float hoverHeight) {
        super(type, color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.onWater = onWater;
        this.hoverHeight = hoverHeight;
    }

    public Hovercraft(){
        super.setType("Hovercraft");
    }

    public boolean isOnWater() {
        return onWater;
    }

    public void setOnWater(boolean onWater) {
        this.onWater = onWater;
    }

    public float getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(float hoverHeight) {
        this.hoverHeight = hoverHeight;
    }


}
