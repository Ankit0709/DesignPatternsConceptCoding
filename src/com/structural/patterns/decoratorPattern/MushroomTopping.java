package com.structural.patterns.decoratorPattern;

public class MushroomTopping extends ToppingDecorator{
    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost()+10;
    }
}
