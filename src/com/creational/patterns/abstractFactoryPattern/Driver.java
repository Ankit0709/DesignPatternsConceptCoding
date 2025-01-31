package com.creational.patterns.abstractFactoryPattern;

import com.creational.patterns.prototypePattern.Car;

public class Driver {
    public static void main(String[] args) {

        AbstractCarFactoryProducer factoryProducer = new AbstractCarFactoryProducer();
        AbstractCarFactory factory = factoryProducer.getCarFactory("LUXURY");
        Car car= (Car) factory.getCarInstance(300000);
        System.out.println(car.toString());

    }
}
