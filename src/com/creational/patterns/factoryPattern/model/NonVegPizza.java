package com.creational.patterns.factoryPattern.model;

import java.util.List;

public class NonVegPizza extends  Pizza{

    public NonVegPizza() {
    }

    public NonVegPizza(String orderId, List<String> addOns) {
        super(orderId, addOns);
    }

    @Override
    public void prepare() {
        System.out.println("Non Veg Pizza is prepared !!");
    }
}
