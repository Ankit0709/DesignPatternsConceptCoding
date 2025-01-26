package com.creational.patterns.factoryPattern.service;

public class Driver {
    public static void main(String[] args) {
        Resturant vegResturant  = new VegResturant();
        vegResturant.orderPizza();

        Resturant nonVegResturant = new NonVegResturant();
        nonVegResturant.orderPizza();
    }
}
