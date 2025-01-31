package com.creational.patterns.abstractFactoryPattern;

import com.creational.patterns.abstractFactoryPattern.model.*;

public class LuxuryCarFactory implements AbstractCarFactory {
    @Override
    public Car getCarInstance(Integer price){
        if(price<=100000){
            return new LuxuryCar1();
        }else if(price>100000){
            return  new LuxuryCar2();
        }
        return  null;
    }
    
}
