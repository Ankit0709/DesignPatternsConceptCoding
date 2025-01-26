package com.creational.patterns.factoryPattern.model;

import java.util.List;

public class VegPizza extends Pizza {


    public VegPizza(String orderId, List<String> addOns) {
        super(orderId, addOns);
    }


    @Override
    public void prepare() {
        System.out.println("Veg pizza is prepared !");
    }
}
