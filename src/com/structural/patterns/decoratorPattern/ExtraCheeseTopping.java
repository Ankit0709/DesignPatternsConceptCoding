package com.structural.patterns.decoratorPattern;

public class ExtraCheeseTopping extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost()+20;
    }
}
