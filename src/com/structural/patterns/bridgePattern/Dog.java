package com.structural.patterns.bridgePattern;

public class Dog extends LivingBeing{

    Dog(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }
    @Override
    public void breathe() {
        breatheImplementor.breatheProcess();
    }
}
