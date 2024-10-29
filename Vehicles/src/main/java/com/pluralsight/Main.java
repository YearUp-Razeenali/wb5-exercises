package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Vehicle vehnum1 = new Vehicle();
        vehnum1.setColor("Blue");
        vehnum1.setType("Moped");

        System.out.println(vehnum1);

        Car car1 = new Car();
        car1.setColor("green");
        System.out.println(car1);

        SemiTruck truck1 = new SemiTruck();
        truck1.setWeightOfCargo(120.23);
        System.out.println(truck1.getWeightOfCargo());

    }
}