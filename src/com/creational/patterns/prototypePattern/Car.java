package com.creational.patterns.prototypePattern;

public class Car extends Vehicle{
     int speed;

    Car(){

    }
    //Copy constructor
    public Car(Car car) {
        super(car);
        this.speed = car.speed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
