package com.creational.patterns.factoryPattern.service;

import com.creational.patterns.factoryPattern.model.NonVegPizza;
import com.creational.patterns.factoryPattern.model.Pizza;

import java.util.List;

public class NonVegResturant extends  Resturant{
    @Override
    public Pizza createPizza() {
        Pizza nonVegPizza = new NonVegPizza("4567", List.of("Meat","Onion","Olive"));
        return  nonVegPizza;
    }
}
