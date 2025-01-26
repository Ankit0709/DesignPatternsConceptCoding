package com.creational.patterns.factoryPattern.service;

import com.creational.patterns.factoryPattern.model.Pizza;
import com.creational.patterns.factoryPattern.model.VegPizza;

import java.util.List;

public class VegResturant extends Resturant{
    @Override
    public Pizza createPizza() {
        Pizza vegPizza = new VegPizza("1234", List.of("Olive","Onion","Tomato"));
        return vegPizza;
    }
}
