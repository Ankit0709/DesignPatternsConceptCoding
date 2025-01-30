package com.creational.patterns.prototypePattern;

public class Driver {
    public static void main(String[] args) {

        Car car = new Car(1,"Maruti","2022","Red",4);

        Car cloneCarCopy = (Car) car.clone();
        System.out.println(cloneCarCopy.toString());
    }
}
