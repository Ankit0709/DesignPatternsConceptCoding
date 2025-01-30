package com.creational.patterns.prototypePattern;

public class Car implements Prototype{
    private int sno;
    private String model;
    private String year;
    private String color;
    private int noOfWheels;

    public Car(int sno, String model, String year, String color, int noOfWheels) {
        this.sno = sno;
        this.model = model;
        this.year = year;
        this.color = color;
        this.noOfWheels = noOfWheels;
    }


    public Car(Car car){
        this.sno = car.sno+1;
        this.model = car.model;
        this.year = car.year;
        this.color = car.color;
        this.noOfWheels = car.noOfWheels;
    }

    @Override
    public Prototype clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "sno=" + sno +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", noOfWheels=" + noOfWheels +
                '}';
    }
}
