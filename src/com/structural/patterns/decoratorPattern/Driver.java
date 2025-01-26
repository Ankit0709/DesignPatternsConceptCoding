package com.structural.patterns.decoratorPattern;

public class Driver {
    public static void main(String[] args) {
        BasePizza pizza1 = new MushroomTopping(new ExtraCheeseTopping(new MargerittaPizza()));
        System.out.println(pizza1.cost());

        BasePizza pizza2=new MushroomTopping(new FarmhousePizza());
        System.out.println(pizza2.cost());
    }
}
