package com.creational.patterns.abstractFactoryPattern;

import com.creational.patterns.abstractFactoryPattern.model.Car;
import com.creational.patterns.abstractFactoryPattern.model.EconomicCar1;
import com.creational.patterns.abstractFactoryPattern.model.EconomicCar2;

public class EconomicCarFactory implements AbstractCarFactory {
    @Override
    public Car getCarInstance
            (Integer price){
        if(price<=100000){
            return new EconomicCar1();
        }else if(price>100000){
            return  new EconomicCar2();
        }
        return  null;
    }

}
