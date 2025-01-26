package com.creational.patterns.prototypePattern;

public class Driver {
    public static void main(String[] args) {
        Bus firstBusObj = new Bus();
        firstBusObj.brand = "Volvo";
        firstBusObj.model = "XT-210";
        firstBusObj.year = "2022";
        firstBusObj.doors = 2;

        Vehicle busCopy = firstBusObj.clone();

        Car firstCarObj = new Car();
        firstCarObj.brand = "Hyndai";
        firstCarObj.model = "Venue";
        firstCarObj.year = "2023";
        firstCarObj.speed = 150;

        Vehicle carCopy = firstCarObj.clone();

    }
}
