package com.pluralsight;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double depreciation = 0;

        if (year >= 0 && year <=3){
            depreciation = 0.03 * getOriginalCost();
        }
        else if (year >= 4 && year <=6) {
            depreciation = 0.06 * getOriginalCost();
        }else if (year >= 7 && year <=10) {
            depreciation = 0.08 * getOriginalCost();
        }else if (year >= 10) {
            return 1000;
        }

        double value = getOriginalCost() - depreciation;

        if (odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")) {
            value -= (0.25 * getOriginalCost());
        }
        //so value doesn't return as negative
        return Math.max(value, 0);

    }
}
