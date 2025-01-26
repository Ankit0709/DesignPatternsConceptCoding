package com.creational.patterns.prototypePattern;

public abstract class Vehicle {
     String brand;
     String model;
     String year;

    public Vehicle() {
    }

    //Copy constructor
    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.year = vehicle.year;
    }

    public abstract Vehicle clone();
}
