package com.creational.patterns.abstractFactoryPattern;

public class AbstractCarFactoryProducer {

    public AbstractCarFactory getCarFactory(String type){
        if(type.equalsIgnoreCase("ECONOMICAL")){
            return  new EconomicCarFactory();
        }else if(type.equalsIgnoreCase("PREMIUM")|| type.equalsIgnoreCase("LUXURY")){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
