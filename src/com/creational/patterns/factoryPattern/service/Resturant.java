package com.creational.patterns.factoryPattern.service;

import com.creational.patterns.factoryPattern.model.Pizza;

public  abstract  class Resturant {
    public Pizza orderPizza(){
        Pizza pizza = createPizza();
        pizza.prepare();
        return  pizza;
    }
    //factory method
    public abstract  Pizza createPizza();
}
