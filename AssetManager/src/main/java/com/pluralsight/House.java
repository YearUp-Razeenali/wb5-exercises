package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double pricePerSquareFoot;

        if(condition == 1){
            pricePerSquareFoot = 180;
        }
        else if (condition == 2) {
            pricePerSquareFoot = 130;
        }
        else if (condition == 3) {
            pricePerSquareFoot = 90;
        }
        else if (condition == 4) {
            pricePerSquareFoot = 80;
        }
        else {
            pricePerSquareFoot = 0;
        }
        return (pricePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}
