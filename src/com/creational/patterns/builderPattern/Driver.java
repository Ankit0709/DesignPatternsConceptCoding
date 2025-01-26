package com.creational.patterns.builderPattern;

public class Driver {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director();
        Car normalCar = director.constuctNormalCar(carBuilder);



        CarBuilder sportsCarBuilder = new CarBuilder();
        Director director2 = new Director();
        Car sportsCar = director2.constructSportsCar(sportsCarBuilder);





    }
}
