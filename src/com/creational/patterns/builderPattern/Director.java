package com.creational.patterns.builderPattern;

public class Director {

    public Car constuctNormalCar(CarBuilder carBuilder){
        carBuilder.id("101");
        carBuilder.model("Venue");
        carBuilder.bootSpace(200);
        carBuilder.color("Red");
        carBuilder.company("Hyndai");
        carBuilder.noOfGears(5);
        carBuilder.rearAcVents(false);
        return carBuilder.build();
    }
    public Car constructSportsCar(CarBuilder sportsCarBuilder){
        sportsCarBuilder.id("102");
        sportsCarBuilder.model("Ferrari");
        sportsCarBuilder.bootSpace(100);
        sportsCarBuilder.color("Yellow");
        sportsCarBuilder.company("Ferrari");
        sportsCarBuilder.noOfGears(6);
        sportsCarBuilder.rearAcVents(true);
        return sportsCarBuilder.build();
    }
}
