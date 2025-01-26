package com.structural.patterns.bridgePattern;

public class Fish extends LivingBeing{

    Fish(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
       breatheImplementor.breatheProcess();
    }
}
